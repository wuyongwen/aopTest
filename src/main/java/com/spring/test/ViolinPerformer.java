package com.spring.test;

import org.springframework.stereotype.Component;

@Component
public class ViolinPerformer implements Performer{

	public void perform() throws Exception {
		System.out.println("小提琴表演");
		//throw new Exception();
	}
}
