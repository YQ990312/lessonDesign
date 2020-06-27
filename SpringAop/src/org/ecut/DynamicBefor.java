package org.ecut;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DynamicBefor implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] objs, Object obj) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("验证用户信息");
	}
	
}
