package com.zero.proxy.jdk;

import com.zero.proxy.jdk.Calculator;
import com.zero.proxy.jdk.MyCalculator;
import com.zero.proxy.jdk.MyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author zero
 * @description ProxyTest
 * @date 2022/5/9 10:42
 */
public class JDKProxyTest {
	public static void main(String[] args) {
		Calculator calculator = (Calculator) Proxy.newProxyInstance(
				MyCalculator.class.getClassLoader(),
				new Class[]{Calculator.class},
				new MyInvocationHandler(new MyCalculator()));
		calculator.add(1,1);

	}
}
