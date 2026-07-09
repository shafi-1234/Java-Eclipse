package com.languageFundamentals;

public class userDefinedObjDataTypes {

	
	
	public static void main(String[] args) {
		// TThese are the Object Defined Data Types
		// Object 1
		
		class student{  
			int stuid=123;
			String stname="shafi"; 
			
		}
		// Object 2;
		class employee{
			int empid=410;
			String empName="shafi";
			
		}
		student s1= new student();
		System.out.println("Student ID : "+s1.stuid);
		System.out.println("Student Name : "+s1.stname);
		
		employee  e1 = new employee();
		System.out.println("Employee ID : "+e1.empid);
		System.out.println("Employee Name : "+e1.empName);

	}

}
