package com.aspectj.annotation;

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

	@Override
	public void doTird() {
		// TODO Auto-generated method stub
		System.out.println("执行doThird方法"+3/0);
		System.out.println("执行doThird方法");
	}

}
