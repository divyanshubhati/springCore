package com.divyanshu.springCoreDemo;

public class Mobile {
	
	String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + "]";
	}

	public Mobile(String s) {
		brand = s;
	}
	

}
