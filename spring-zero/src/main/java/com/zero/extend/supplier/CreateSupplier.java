package com.zero.extend.supplier;

import com.zero.entity.User;

/**
 * @author zero
 * @description CreateSupplier
 * @date 2022/4/25 10:54
 */
public class CreateSupplier {
	public static User createUser() {
		return new User("张三");
	}
}
