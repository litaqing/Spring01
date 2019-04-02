package com.lexie.aop01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮ǰ");
		Object result = invocation.proceed();
		System.out.println("ִ�л���֪ͨ��Ŀ�귽��ִ��֮��");
		if (result!=null) {
			result=((String)result).toUpperCase();
		}
		return result;
	}

}
