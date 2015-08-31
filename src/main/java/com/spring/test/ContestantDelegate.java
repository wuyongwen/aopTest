package com.spring.test;

import org.springframework.stereotype.Component;

@Component
public class ContestantDelegate implements Contestant{

	public void receiveAward() {
		System.out.println("竞争者委派");
	}
	
}
