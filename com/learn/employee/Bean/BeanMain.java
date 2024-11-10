package com.learn.employee.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;

public class BeanMain {
	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp = context.getBean("e1",Employee.class);
		
		System.out.println(emp);
		Manager mana = context.getBean("m1",Manager.class);
		System.out.println(mana);
		
				
	}

}
