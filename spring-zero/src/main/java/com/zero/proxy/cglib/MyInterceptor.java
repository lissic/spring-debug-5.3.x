package com.zero.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zero
 * @description MyInterceptor
 * @date 2022/5/9 11:40
 */
public class MyInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		Object result = null;
		System.out.println("cglib代理方法执行之前。。。。");
		String name = methodProxy.getSignature().getName();
		if ("add".equals(name)) {
			result = methodProxy.invokeSuper(o, objects);
		}
		System.out.println("cglib代理方法执行之后。。。。");
		return result;
	}
}
