package com.learn.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMain {
	public static void main(String[] args) {
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		
		Manager mana = context.getBean("manager",Manager.class);
		System.out.println(mana);
		
		
	}

}
