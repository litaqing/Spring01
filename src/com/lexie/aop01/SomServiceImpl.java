package com.lexie.aop01;

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

}
