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

#include <stdio.h>
#include <string.h>

/*Outputs file contents to stdout as hex*/
void printFileAsHex(FILE* file);
/*Returns the byte value as one of a limited range of visible characters*/
char toVisibleCharacter(int byteVal);
/*Writes buflen bytes from the buffer to stdout using writeLine*/
void writeBuffer(char* lineBuffer, int buflen);
/*
 * Writes "count" bytes from "lineBuffer" starting at "offset". 
 * Writes LINELEN bytes to stdout followed by a tab followed by the character
 * representation.
 */
void writeLine(char* lineBuffer, int offset, int count);
/*Returns the upper nibble in a byte as a base 16 digit.*/
char upperToHex(int byteVal);
/*Returns the lower nibble in a byte as a base 16 digit.*/
char lowerToHex(int byteVal);
/*Returns the integer nibble value as a base 16 character digit.*/
char nibbleToHex(int nibble);
/*If an error code exists, prints it to stdout.*/
void printError(FILE* file);
