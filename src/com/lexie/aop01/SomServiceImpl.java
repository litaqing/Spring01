package com.lexie.aop01;

import com.lexie.utils.SystemService;

public class SomServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("ִ��dofirst����");
	}
	@Override
	public void doSecond() {
		System.out.println("ִ��dosecond����");
	}

}
