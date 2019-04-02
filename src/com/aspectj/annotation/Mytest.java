package com.aspectj.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	@Test
	public void test01() {
		String resource = "com/aspectj/annotation/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
	
		ISomeService service =(ISomeService) ac.getBean("someService");
		service.doFirst();
		System.out.println("----------------------");
		service.doSecond();
		System.out.println("----------------------");
		service.doTird();
		System.out.println("----------------------");
	}
}
