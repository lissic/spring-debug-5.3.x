package com.zero.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zero
 * @description MyProxy
 * @date 2022/5/9 11:43
 */
public class CGLIBProxyTest {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setClassLoader(MyCalculator.class.getClassLoader());
		enhancer.setSuperclass(MyCalculator.class);
		enhancer.setCallback(new MyInterceptor());
		MyCalculator calculator = (MyCalculator) enhancer.create();
		calculator.add(1,1);
		System.out.println(calculator);
	}
}
