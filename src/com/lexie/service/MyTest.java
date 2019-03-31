package com.lexie.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lexie.service.ISomeService;
import com.lexie.service.ServiceFactory;
import com.lexie.service.SomeServiceImpl;

public class MyTest {

	@Test
	public void test01() {
		ISomeService service = new ServiceFactory().getSomeService();
		service.doSome();
	}
	@Test
	public void test02() {
		ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ISomeService service = (ISomeService) ac.getBean("myService");
		
		System.out.println(service.doSome());
		//销毁之前方法的执行，有两个条件
		//1.当前的bean需要是singleton的
		//2.要手工关闭容器
		((ClassPathXmlApplicationContext)ac).close();
	}
	@Test
	public void test03() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service = (ISomeService) bf.getBean("myService");
		service.doSome();
	}
}
