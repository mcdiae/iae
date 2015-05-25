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

import java.beans.FeatureDescriptor;
import java.util.Iterator;
import java.util.Map;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.el.MapELResolver;

/**
 * @author McDowell
 */
public class DemoELResolver extends ELResolver {

	private ELResolver delegate = new MapELResolver();
	private Map<Object, Object> userMap;
	
	public DemoELResolver(Map<Object, Object> userMap) {
		this.userMap = userMap;
	}
	
	@Override
	public Object getValue(ELContext context, Object base, Object property) {
		if(base==null) {
			base = userMap;
		}
		return delegate.getValue(context, base, property);
	}
	
	@Override
	public Class<?> getCommonPropertyType(ELContext context, Object base) {
		if(base==null) {
			base = userMap;
		}
		return delegate.getCommonPropertyType(context, base);
	}

	@Override
	public Iterator<FeatureDescriptor> getFeatureDescriptors(ELContext context,
			Object base) {
		if(base==null) {
			base = userMap;
		}
		return delegate.getFeatureDescriptors(context, base);
	}

	@Override
	public Class<?> getType(ELContext context, Object base, Object property) {
		if(base==null) {
			base = userMap;
		}
		return delegate.getType(context, base, property);
	}
	
	@Override
	public boolean isReadOnly(ELContext context, Object base, Object property) {
		if(base==null) {
			base = userMap;
		}
		return delegate.isReadOnly(context, base, property);
	}

	@Override
	public void setValue(ELContext context, Object base, Object property, Object value) {
		if(base==null) {
			base = userMap;
		}
		delegate.setValue(context, base, property, value);
	}

}
