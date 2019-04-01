package com.lexie.aop01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.lexie.utils.SystemService;

public class Mytest {
	public static void main(String[] args) {
		final ISomeService target = new SomServiceImpl();
		ISomeService service = (ISomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				SystemService.doTx();
				Object result = method.invoke(target, args);
				SystemService.doLog();
				return result;
			}
		});
		service.doFirst();
		System.out.println("--------------");
		service.doSecond();
	}
}
