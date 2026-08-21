package com.LabTask;

public class EmployeeConstructor {
	int empId;
	String empName;
	double salary;
	EmployeeConstructor(){
		
	}
//	EmployeeConstructor(int empId,String empName,double salary){
//		this.empId=empId;
//		this.empName=empName;
//		this.salary=salary;
//		
//	}
	EmployeeConstructor(EmployeeConstructor p,String empName,double salary){
		this.empId=p.empId;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	EmployeeConstructor(EmployeeConstructor p1,int empId,String empName){
		this.empId=p1.empId;
		this.salary=p1.salary;
		this.empId=empId;
		this.empName=empName;
		
		
	}

	public static void main(String[] args) {
		EmployeeConstructor p = new EmployeeConstructor();
		System.out.println("Employee 1 ");
		p.empId=101;
		p.empName="Krishna";
		p.salary=50000.0;
		p.display();

		EmployeeConstructor p1 = new EmployeeConstructor(p,"Ravi",(p.salary=p.salary+10000));
		System.out.println("Employee 2");
		p1.display();
		
		
		EmployeeConstructor p2= new EmployeeConstructor(p1,102,"Shafi");
		System.out.println("Employee 3");
		p2.display();

	}
	void display() {
		System.out.println("ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Salary : "+salary);
		System.out.println("----------------------------");
	}

}
 