package com.languageFundamentals;

public class NotPremitiveWrapper {
	// Problem Without Using Not Premitive data Types(string and integer and Float)
	// Using  Wrapper  we can declare the string as (String), and int as (Integer), and double as (Double) 
	
	Integer Empid;
	String Empname;
	Double monthly_salary;
	String Hire_date;
	String Experience;
	String Department;
	Double annual_salary;
	Double annual_bonous;
	Double total_earnings;
	public static void main(String[] args) {
		NotPremitiveWrapper e= new NotPremitiveWrapper();
		e.Empid=101;
		e.Empname="Shafi";
		e.Department="IT";
		e.monthly_salary=5000.0;
		e.Hire_date="12-11-2021";
		e.Experience="2.5 Years";
		e.annual_salary=12*(e.monthly_salary);
		e.annual_bonous=e.annual_salary/10;
		e.total_earnings=e.annual_salary+e.annual_bonous;
		e.display();
		
		

	}
	void display() {
		System.out.println("Employee ID : "+Empid);
		System.out.println("Employee Name : "+Empname);
		System.out.println("Employee HireDate : "+Hire_date);
		System.out.println("Employee department : "+Department);
		System.out.println("Employee salary : "+monthly_salary);
		System.out.println("Employee Experience : "+Experience);
		System.out.println("Emplyee Annual Salary: "+annual_salary);
		System.out.println("Employee Bonous : "+annual_bonous);
		System.out.println("Employee Total Earnings : "+total_earnings);
		
	}

}
