package com.wwang.model.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		IUserService userService = new UserService();
		UserInvocationHandler uih = new UserInvocationHandler(userService);
		IUserService proxy = (IUserService) Proxy.newProxyInstance(
				userService.getClass().getClassLoader(), 
				new Class[] {IUserService.class}, uih);
		proxy.printAll(); // 打印出start : 1489665566456  print all users  end : 1489665566457

	}

}
