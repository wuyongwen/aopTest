package com.spring.test;

import org.springframework.stereotype.Component;

@Component
public class Audience {
	public void takeSeats(){
		System.out.println("表演之前。。。");
	}
	public void applaud(){
		System.out.println("表演之后。。。");
	}
	public void demandRefound(){
		System.out.println("表演失败后...");
	}
}
