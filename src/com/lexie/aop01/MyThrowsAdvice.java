package com.lexie.aop01;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	//��Ŀ�귽���׳���ָ�����͵��쳣����is-a��ϵ���쳣ʱ��ִ�е�ǰ����
	public void afterThrowing(Exception ex){
		System.out.println("ִ���쳣֪ͨ����");
	}
}
