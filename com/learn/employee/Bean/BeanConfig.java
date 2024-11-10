package com.learn.employee.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learn.employee.Bean" )

public class BeanConfig {
	@Bean
	public Employee e1()
	{
		return new Employee(101,"rahul",null);
	}
	@Bean
	public Employee e2() {
		return new Employee(102, "Amit", "Manager");
	}
	@Bean
	public Manager m1() {
		return new Manager(1, "Shriya", 50000);
	}

}
