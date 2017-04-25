package com.wwang.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler策略，这里打印了方法调用前后的时间
 * @author Administrator
 *
 */
public class UserInvocationHandler implements InvocationHandler {
	
	private IUserService userService;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("start : " + System.currentTimeMillis());
        Object result = method.invoke(userService, args);
        System.out.println("end : " + System.currentTimeMillis());
        return result;
	}

	public UserInvocationHandler(IUserService userService) {
		super();
		this.userService = userService;
	}
	
	

	
}
