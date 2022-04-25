package com.zero.extend.supplier;

import com.zero.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zero
 * @description TestSupplier
 * @date 2022/4/25 10:58
 */
public class TestSupplier {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("supplier.xml");
		User bean = ac.getBean(User.class);
		System.out.println(bean.getName());
	}
}
