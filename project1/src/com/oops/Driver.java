package com.oops;

public class Driver {

	public static void main(String[] args) {
		Employee e=new  Employee();
		e.setnum(22);
		e.setName("Shafi");
		e.setSal(-1000);
		System.out.println("Employee Number : "+e.getnum());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee Sal : "+e.getSal());
	}

}
