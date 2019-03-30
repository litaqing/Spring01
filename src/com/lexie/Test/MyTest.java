package com.lexie.Test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lexie.service.ISomeService;
import com.lexie.service.SomeServiceImpl;

public class MyTest {

	@Test
	public void test01() {
		ISomeService service = new SomeServiceImpl();
		service.doSome();
	}
	@Test
	public void test02() {
		ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
	}
	@Test
	public void test03() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service = (ISomeService) bf.getBean("myService");
		service.doSome();
	}
}
