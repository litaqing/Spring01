package com.lexie.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
	与@Component注解功能相同，但意义不同的注解还有三个
	1.@Repository：注解在dao实现类上
	2.@Service：注解在service实现类上
	3.@Controller:注解在springmvc的处理器上
*/
@Component("myPerson")
public class Person {
	@Value("李踏青")
	private String pname;
	@Value("23")
	private int page;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", page=" + page + "]";
	}

	
}
