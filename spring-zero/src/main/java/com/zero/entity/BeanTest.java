package com.zero.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zero
 * @description BeanTest
 * @date 2022/3/29 17:29
 */
public class BeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
}
