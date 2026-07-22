package com.LabTask;

import java.util.Scanner;

public class SalarySlip {
	
	
	static void salarySlip(String empName,double sal) {
		double hra=sal*(0.20);
		double da=sal*(0.10);
		double grossSalary=sal+hra+da;
		System.out.println("Employee Name : "+empName);
		System.out.println("Basic salary : "+sal);
		System.out.println("HRA(20%) : "+hra);
		System.out.println("DA(10%) : "+da);
		System.out.println("Gross Salary : "+grossSalary);
		
	}
  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Employee : ");
		String empName=sc.next();
		System.out.print("Enter the basic salary : ");

		double sal=sc.nextDouble();
		
		salarySlip( empName, sal);

	}

}
