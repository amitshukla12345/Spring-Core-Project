
package com.learn.employee.Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int  emp_id;
	private String emp_name;
	private String job_name;
	@Autowired
	private Manager manager;
	
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", job_name=" + job_name + ", manager="
				+ manager + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String emp_name, String job_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.job_name = job_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	

}
