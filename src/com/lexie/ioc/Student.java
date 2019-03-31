package com.lexie.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("李学好")
	private String sname;
	@Value("56")
	private int sage;
	/*@Autowired 					bytype方式的注解式注入
	@Qualifier("mySchool") 			byname注解式注入，要求@Autowired @Qualifier联合使用
	 		以下为jsr-250规范中的resource注解			
	@Resource(name="mySchool") byname方式注入
	*/
	@Resource  //bytype方式注入
	private School school;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", school=" + school + "]";
	}
	
	
}
