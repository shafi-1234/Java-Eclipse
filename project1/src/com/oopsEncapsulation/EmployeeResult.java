package com.oopsEncapsulation;

public class EmployeeResult {

	public static void main(String[] args) {
		Employee e1 =  new Employee();
		e1.setID(1);
		e1.setName("Shafi");
		e1.setSalary(200000);
		e1.setPassword("Shaf@124");
		
		System.out.println("Employee Id : "+e1.getId());
		System.out.println("Employee Name : "+e1.getName());
		System.out.println("Employee Salary : "+e1.getSalary());
		System.out.println("Password : "+e1.getPassword());

	}



}
