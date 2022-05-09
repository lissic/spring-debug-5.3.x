package com.zero.proxy.cglib;

/**
 * @author zero
 * @description MyCalculator
 * @date 2022/5/9 11:04
 */
public class MyCalculator {
	public void add(int i, int j) {
		System.out.println("执行加法操作:" + (i + j));
	}

	public void sub(int i, int j) {
		System.out.println("执行减法操作:" + (i - j));
	}

	public void multi(int i, int j) {
		System.out.println("执行乘法操作:" + (i * j));
	}

	public void div(int i, int j) {
		System.out.println("执行除法操作:" + (i / j));
	}
}
