/*
Copyright (c) 2008 McDowell

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

#include "phex.h"
#include "consts.h"

int main(int argc, const char* argv[])
{
    FILE* file;
    
    if(argc != 2)
    {
        printf("Usage: phex <file>");
        printf(CRLF);
        return 1;
    }
    
    file = fopen(argv[1], "rb");
    if(NULL == file)
    {
    	printf("Cannot open %s", argv[1]);
    	printf(CRLF);
        return 2;
    }
    
    printFileAsHex(file);
    
    fclose(file);
    
    return 0;
}

void printFileAsHex(FILE* file)
{
    char buffer[LINELEN * 32];
    
    while(1)
    {
    	int r = fread(buffer, 1, LINELEN, file);
    	if(r <= 0)
    	{
    		printError(file);
    		break;
    	}
    	
    	writeBuffer(buffer, r);
    }
}

char toVisibleCharacter(int byteVal)
{
    if(byteVal >= 32 && byteVal <= 126)
    {
        return (char) byteVal;
    }
    
    return '_';
}

void writeBuffer(char* lineBuffer, int buflen)
{
	int offset = 0;
	while(offset < buflen)
	{
		if(LINELEN + offset > buflen)
		{
			writeLine(lineBuffer, offset, buflen - offset);
		}
		else
		{
			writeLine(lineBuffer, offset, LINELEN);
		}
		offset += LINELEN;
	}
}

void writeLine(char* lineBuffer, int offset, int count)
{
    int i;

    const int LIMIT = (LINELEN * 4) + 1 + 1;
    int n = 0;
    char outBuff[LIMIT];
    
    for(i=offset; i<count; i++)
    {
        outBuff[n++] = upperToHex(lineBuffer[i]);
        outBuff[n++] = lowerToHex(lineBuffer[i]);
    }
    
    if(count < LINELEN)
    {
        for(i = (LINELEN - count) * 2; i>0; i--)
        {
        	outBuff[n++] = ' ';
        }
    }

    outBuff[n++] = '\t';
    
    for(i=offset; i<count; i++)
    {
    	outBuff[n++] = toVisibleCharacter(lineBuffer[i]);
    }
    
    outBuff[n++] = '\0'; //terminate string
    
    if(n >= LIMIT)
    {
    	printf("BUFFER OVERFLOW");
    }

    printf(outBuff);
    printf(CRLF);
}

char upperToHex(int byteVal)
{
    int i = (byteVal & 0xF0) >> 4;
    return nibbleToHex(i);
}

char lowerToHex(int byteVal)
{
    int i = (byteVal & 0x0F);
    return nibbleToHex(i);
}

char nibbleToHex(int nibble)
{
    const int ascii_zero = 48;
    const int ascii_a = 65;
    
    if((nibble >= 0) && (nibble <= 9))
    {
        return (char) (nibble + ascii_zero);
    }
    if((nibble >= 10) && (nibble <= 15))
    {
        return (char) (nibble - 10 + ascii_a);
    }
    return '?';
}

void printError(FILE* file)
{
	int errcode = ferror(file);
	if(errcode != 0)
	{
		printf(strerror(errcode));
		printf(CRLF);
	}
}

