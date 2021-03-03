package com.divyanshu.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class Graduation implements Task {

	public void display() {
		System.out.println("Happy Graduation👨‍🎓");
		
	}

}
