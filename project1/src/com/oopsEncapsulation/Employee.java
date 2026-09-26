package com.oopsEncapsulation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String Password;
	
	
	// Setter
	
	public void setID(int id) {
		this.id= id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public void setPassword(String Password) {
		this.Password=Password;
	}
	
	
	
	
	// Getter
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getPassword() {
		return Password;
	}

}
