package com.learn.employee.Bean;

public class Manager {
	private int m_id;
	private String m_name;
	private int m_salary;
	@Override
	public String toString() {
		return "Manager [m_id=" + m_id + ", m_name=" + m_name + ", m_salary=" + m_salary + "]";
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int m_id, String m_name, int m_salary) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_salary = m_salary;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_salary() {
		return m_salary;
	}
	public void setM_salary(int m_salary) {
		this.m_salary = m_salary;
	}

}
