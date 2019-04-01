package com.lexie.service05;

import com.lexie.utils.SystemService;

public class SomServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		// TODO Auto-generated method stub
		System.out.println("执行dofirst方法");
	}
	@Override
	public void doSecond() {
		System.out.println("执行dosecond方法");
	}

}
