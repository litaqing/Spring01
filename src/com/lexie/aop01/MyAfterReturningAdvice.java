package com.lexie.aop01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//���Ի�ȡ��Ŀ�귽���ķ���ֵ�����޷��޸ķ���ֵ
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ִ�к��÷��� +returnValue-------------"+returnValue);
	}

}
