package com.divyanshu.springCoreAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cake {
	
	@Autowired
	@Qualifier("choco")
	Flavour f;

	@Override
	public String toString() {
		return f.display() + " Cake";
	}
	
	

}
