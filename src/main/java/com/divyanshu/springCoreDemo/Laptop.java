package com.divyanshu.springCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	Harddrive hd;

	@Override
	public String toString() {
		return "Laptop [hd=" + hd + "]";
	}
	

}
