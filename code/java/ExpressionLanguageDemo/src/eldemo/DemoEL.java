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
import java.util.HashMap;
import java.util.Map;

import javax.el.ArrayELResolver;
import javax.el.BeanELResolver;
import javax.el.CompositeELResolver;
import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.ExpressionFactory;
import javax.el.FunctionMapper;
import javax.el.ListELResolver;
import javax.el.MapELResolver;
import javax.el.ValueExpression;
import javax.el.VariableMapper;

/**
 * A simple application that demonstrates the use of the
 * Unified Expression Language.
 * @author McDowell
 */
public class DemoEL {

	/**
	 * takes the javax.el.ExpressionFactory implementation class as an argument
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		if(args.length<1) {
			System.out.println("Provide javax.el.ExpressionFactory implementation class as argument");
			System.exit(1);
		}
		
		//load the expression factory
		System.out.println("javax.el.ExpressionFactory="+args[0]);
		ClassLoader cl = DemoEL.class.getClassLoader();
		Class<?> expressionFactoryClass = cl.loadClass(args[0]);
		ExpressionFactory expressionFactory = (ExpressionFactory) expressionFactoryClass.newInstance();
		
		//create a map with some variables in it
		Map<Object, Object> userMap = new HashMap<Object, Object>();
		userMap.put("x", Integer.valueOf(123));
		userMap.put("y", Integer.valueOf(456));
		
		//get the method for ${myprefix:hello(string)}
		Method sayHello = DemoEL.class.getMethod("sayHello", new Class[]{String.class});
		
		//create the context
		ELResolver demoELResolver = new DemoELResolver(userMap);
		final VariableMapper variableMapper = new DemoVariableMapper();
		final DemoFunctionMapper functionMapper = new DemoFunctionMapper();
		functionMapper.addFunction("myprefix", "hello", sayHello);
		final CompositeELResolver compositeELResolver = new CompositeELResolver();
		compositeELResolver.add(demoELResolver);
		compositeELResolver.add(new ArrayELResolver());
		compositeELResolver.add(new ListELResolver());
		compositeELResolver.add(new BeanELResolver());
		compositeELResolver.add(new MapELResolver());
		ELContext context = new ELContext() {
			@Override
			public ELResolver getELResolver() {
				return compositeELResolver;
			}
			@Override
			public FunctionMapper getFunctionMapper() {
				return functionMapper;
			}
			@Override
			public VariableMapper getVariableMapper() {
				return variableMapper;
			}
		};
		
		//create and resolve a value expression
		String sumExpr = "${x+y}";
		ValueExpression ve = expressionFactory.createValueExpression(context, sumExpr, Object.class);
		Object result = ve.getValue(context);
		System.out.println("Result="+result);
		
		//call a function
		String fnExpr = "#{myprefix:hello('Dave')}";
		ValueExpression fn = expressionFactory.createValueExpression(context, fnExpr, Object.class);
		fn.getValue(context);
	}

	public static String sayHello(String argument) {
		System.out.println("Hello, "+argument);
		return "OK";
	}
	
}
