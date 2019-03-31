package com.lexie.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	@Value("��ѧ��")
	private String sname;
	@Value("56")
	private int sage;
	/*@Autowired 					bytype��ʽ��ע��ʽע��
	@Qualifier("mySchool") 			bynameע��ʽע�룬Ҫ��@Autowired @Qualifier����ʹ��
	 		����Ϊjsr-250�淶�е�resourceע��			
	@Resource(name="mySchool") byname��ʽע��
	*/
	@Resource  //bytype��ʽע��
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
