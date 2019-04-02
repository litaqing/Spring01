package com.lexie.aop01;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//可以获取到目标方法的返回值，但无法修改返回值
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行后置方法 +returnValue-------------"+returnValue);
	}

}
