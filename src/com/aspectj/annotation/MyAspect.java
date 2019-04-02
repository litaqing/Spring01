package com.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
@Aspect //��ʾ��ǰ��Ϊ����
public class MyAspect {
	/*@Before("execution(* *..ISomeService.doFirst(..))")*/
	public void before(){
		System.out.println("ִ��ǰ�÷���");
	}
/*	@Before("execution(* *..ISomeService.doFirst(..))")*/
	public void before(JoinPoint jp){
		System.out.println("ִ��ǰ�÷��� jp= "+jp);
	}
/*	@AfterReturning("execution(* *..ISomeService.doSecond(..))")*/
	public void afterReturning(){
		System.out.println("ִ�к��÷���");
	}
/*	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))",returning="result")*/
	public void afterReturning(Object result){
		System.out.println("ִ�к��÷��� result= "+result);
	}
/*	@Around("execution(* *..ISomeService.doSecond(..))")*/
	public Object Around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("ִ�л��Ʒ�����Ŀ�귽��ִ��֮ǰ ");
		Object result = pjp.proceed();
		System.out.println("ִ�л��Ʒ�����Ŀ�귽��ִ��֮�� ");
		if (result!=null) {
			result=((String)result).toUpperCase();
		}
		return result;
	}
	/*@AfterThrowing("execution(* *..ISomeService.doTird(..))")*/
	public void AfterThrowing(){
		System.out.println("ִ���쳣֪ͨ����");
	}
	/*@AfterThrowing(value="execution(* *..ISomeService.doTird(..))",throwing="ex")*/
	public void AfterThrowing(Exception ex){
		System.out.println("ִ���쳣֪ͨ���� ex="+ex.getMessage());
	}
/*	@After("execution(* *..ISomeService.doTird(..))")*/
	public void After(){
		System.out.println("ִ������֪ͨ����");
	}
/*	@Pointcut("execution(* *..ISomeService.doTird(..))")
	public void doThirdPointcut(){}*/
}
