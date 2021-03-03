package com.divyanshu.springCoreAnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.divyanshu.springCoreAnnotationDemo")
public class AppConfig {
// this can be replaced by component annotation
//	@Bean
//	public Cake getCake() {
//		return new Cake();
//	}
//	
//	@Bean
//	public Flavour getFlavour() {
//		return new BlackForest();
//	}
}
