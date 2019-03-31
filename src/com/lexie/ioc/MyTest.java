package com.lexie.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/lexie/ioc/applicationContext.xml")
public class MyTest {
	@Autowired
	private Student student;
	@Autowired
	private Person person;

	@Test
	public void test01() {
		System.out.println(person);
		System.out.println(student);
	}

}
