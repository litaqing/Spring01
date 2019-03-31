package com.lexie.service;

public class ServiceFactory {
	public static ISomeService getSomeService(){
		return new SomeServiceImpl();
	}
}
