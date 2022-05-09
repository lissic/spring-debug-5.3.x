package com.zero.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zero
 * @description MyInvocationHandler
 * @date 2022/5/9 10:45
 */
public class MyInvocationHandler implements InvocationHandler {
	private Calculator target;

	public MyInvocationHandler(Calculator calculator) {
		this.target = calculator;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法执行前。。。。");
		method.invoke(target, args);
		System.out.println("方法执行后。。。。");
		return proxy;
	}
}
