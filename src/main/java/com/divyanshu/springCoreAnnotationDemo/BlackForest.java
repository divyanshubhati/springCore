package com.divyanshu.springCoreAnnotationDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// set the default flavour
@Primary
public class BlackForest implements Flavour {

	public String display() {
		return "BlackForest";
	}

}
