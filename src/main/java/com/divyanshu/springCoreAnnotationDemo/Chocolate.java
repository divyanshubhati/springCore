package com.divyanshu.springCoreAnnotationDemo;

import org.springframework.stereotype.Component;

@Component("choco")
public class Chocolate implements Flavour {

	public String display() {
		return "Chocolate";
	}

}
