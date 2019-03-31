package com.lexie.service;

public class SomeServiceImpl implements ISomeService{

	public SomeServiceImpl() {
		super();
		System.out.println("执行无参构造器");
	}

	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		System.out.println("执行doSome()方法");
		return "abcd";
	}
	
	public void setUp(){
		System.out.println("生命起始");
	}
	
	public void tearDown(){
		System.out.println("销毁之前");
	}

}
