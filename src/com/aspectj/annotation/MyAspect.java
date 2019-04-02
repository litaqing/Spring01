package com.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
@Aspect //表示当前类为切面
public class MyAspect {
	/*@Before("execution(* *..ISomeService.doFirst(..))")*/
	public void before(){
		System.out.println("执行前置方法");
	}
/*	@Before("execution(* *..ISomeService.doFirst(..))")*/
	public void before(JoinPoint jp){
		System.out.println("执行前置方法 jp= "+jp);
	}
/*	@AfterReturning("execution(* *..ISomeService.doSecond(..))")*/
	public void afterReturning(){
		System.out.println("执行后置方法");
	}
/*	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))",returning="result")*/
	public void afterReturning(Object result){
		System.out.println("执行后置方法 result= "+result);
	}
/*	@Around("execution(* *..ISomeService.doSecond(..))")*/
	public Object Around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕方法，目标方法执行之前 ");
		Object result = pjp.proceed();
		System.out.println("执行环绕方法，目标方法执行之后 ");
		if (result!=null) {
			result=((String)result).toUpperCase();
		}
		return result;
	}
	/*@AfterThrowing("execution(* *..ISomeService.doTird(..))")*/
	public void AfterThrowing(){
		System.out.println("执行异常通知方法");
	}
	/*@AfterThrowing(value="execution(* *..ISomeService.doTird(..))",throwing="ex")*/
	public void AfterThrowing(Exception ex){
		System.out.println("执行异常通知方法 ex="+ex.getMessage());
	}
/*	@After("execution(* *..ISomeService.doTird(..))")*/
	public void After(){
		System.out.println("执行最终通知方法");
	}
/*	@Pointcut("execution(* *..ISomeService.doTird(..))")
	public void doThirdPointcut(){}*/
}
