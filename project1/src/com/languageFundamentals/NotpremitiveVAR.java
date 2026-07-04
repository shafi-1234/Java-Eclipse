package com.languageFundamentals;

public class NotpremitiveVAR {
	// Problem Without Using Not Premitive data Types(string and integer and Float)
	//Using  var  we can declare the string and integer
	
	
	

	public static void main(String[] args) {
		NotpremitiveVAR n= new NotpremitiveVAR();
		var Empid=Integer.valueOf(101);
		var EmpName="Shafi";
		var HireDate="01-11-2021";
		var department="IT";
		var salary=Double.valueOf(5000.0);
		var Anual_Salary=12*salary;
		var bonous=Anual_Salary/10;
		var totalsalary=Anual_Salary+bonous;
		
		
		
		System.out.println("Employee ID : "+Empid);
		System.out.println("Employee Name : "+EmpName);
		System.out.println("Employee HireDate : "+HireDate);
		System.out.println("Employee department : "+department);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee ID : "+Empid);
		System.out.println("Emplyee Annual Salary: "+Anual_Salary);
		System.out.println("Employee Bonous : "+bonous);
		System.out.println("Employee Total Earnings : "+totalsalary);
		
	}

}
