package com.lexie.service;

public class SomeServiceImpl implements ISomeService{

	public SomeServiceImpl() {
		super();
		System.out.println("ִ���޲ι�����");
	}

	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		System.out.println("ִ��doSome()����");
		return "abcd";
	}
	
	public void setUp(){
		System.out.println("������ʼ");
	}
	
	public void tearDown(){
		System.out.println("����֮ǰ");
	}

}
