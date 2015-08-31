package com.spring.test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AudienceAnnotation {
	@Pointcut("execution(* com.spring.test.Performer.perform(..))")
	public void a(){
		
	}
	@Before("a()")
	public void takeSeats(){
		System.out.println("表演之前。。。");
	}
	@AfterReturning("a()")
	public void applaud(){
		System.out.println("表演之后。。。");
	}
	@AfterThrowing("a()")
	public void demandRefound(){
		System.out.println("表演失败后...");
	}
}
