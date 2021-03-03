package com.divyanshu.springCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

	public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("defination.xml");
    	Task t1 = (Task)context.getBean("birthdayEvent");
    	t1.display();
    	Task t2 = (Task)context.getBean("graduation");
    	t2.display();
    	Mobile m = (Mobile)context.getBean("mobileItem");
    	System.out.println(m);
    	Laptop l = (Laptop)context.getBean("laptop");
    	System.out.println(l);

	}

}
