package com.lexie.aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
	@Test
	public void test01() {
		String resource = "com/lexie/aop01/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		System.out.println("------------");
		String second = service.doSecond();
		System.out.println(second);
		System.out.println("------------");
		service.doTird();
	}
}
