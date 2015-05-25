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
package eldemo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import javax.el.FunctionMapper;

/**
 * @author McDowell
 */
public class DemoFunctionMapper extends FunctionMapper {

	private Map<String, Method> functionMap = new HashMap<String, Method>();
	
	@Override
	public Method resolveFunction(String prefix, String localName) {
		String key = prefix + ":" + localName;
		return functionMap.get(key);
	}

	public void addFunction(String prefix, String localName, Method method) {
		if(prefix==null || localName==null || method==null) {
			throw new NullPointerException();
		}
		int modifiers = method.getModifiers();
		if(!Modifier.isPublic(modifiers)) {
			throw new IllegalArgumentException("method not public");
		}
		if(!Modifier.isStatic(modifiers)) {
			throw new IllegalArgumentException("method not static");
		}
		Class<?> retType = method.getReturnType();
		if(retType == Void.TYPE) {
			throw new IllegalArgumentException("method returns void");
		}
		
		String key = prefix + ":" + localName;
		functionMap.put(key, method);
	}
	
}
