package com.aspectj.annotation;

public class SomServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("ִ��dofirst����" );
	}

	@Override
	public String doSecond() {
		System.out.println("ִ��dosecond����");
		return "abcd";
	}

	@Override
	public void doTird() {
		// TODO Auto-generated method stub
		System.out.println("ִ��doThird����"+3/0);
		System.out.println("ִ��doThird����");
	}

}
