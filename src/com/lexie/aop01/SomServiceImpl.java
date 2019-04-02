package com.lexie.aop01;

public class SomServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行dofirst方法" );
	}

	@Override
	public String doSecond() {
		System.out.println("执行dosecond方法");
		return "abcd";
	}

}
