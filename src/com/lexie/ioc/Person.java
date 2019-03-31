package com.lexie.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
	��@Componentע�⹦����ͬ�������岻ͬ��ע�⻹������
	1.@Repository��ע����daoʵ������
	2.@Service��ע����serviceʵ������
	3.@Controller:ע����springmvc�Ĵ�������
*/
@Component("myPerson")
public class Person {
	@Value("��̤��")
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
