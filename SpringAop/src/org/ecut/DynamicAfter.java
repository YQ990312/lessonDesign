package org.ecut;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DynamicAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj, Method method, Object[] objs, Object obj2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("����ִ�����");
	}

}
