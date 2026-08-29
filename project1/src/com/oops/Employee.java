package com.oops;

public class Employee {

	private int num;
	private String name;
	private double sal;

	
	public void setnum(int num) {
		this.num=num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSal(double sal) {
		if(sal<0) {
			System.out.println("invalid");
		}else {
			this.sal=sal;
		}
		
		
	}
	
	
	// Getters 
	public int getnum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSal() {
		
		
		return sal;
		
		
	
	}
	
}
