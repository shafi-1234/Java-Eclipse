package com.basics;

public class Student {
//  Declaration
//	instance variables or non-static
	int sid = 100;
	String sname = "Unknown";

//	static variables 
	static int collegeId = 666;
	static String collegeName = "VSS";

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Student Information from Vcube !");

//		Accessing the instance data 
//		Note : We cannot Access instance data in static area directly.
//		If we want to Access instance data in static area, 
//		We must need to create Object.

		// LHS : Student is a Class name & srinu is a Object Reference variable.
//		= is assignment Operator 
//		RHS : new is a keyword to create Object in java.
//			: Student() is Constructor Calling 
//		Why Constructor means to Initialize the Object of a class.

		Student srinu = new Student();// Object Creation

//		Initialization 
		collegeId = 555;
		collegeName = "Vcube";

//		Accessing the static data 
		System.out.println("College ID : " + collegeId);// 0 --> 555
		System.out.println("College Name : " + collegeName);// null --> Vcube

		srinu.sid = 101;
		srinu.sname = "Srinavas S";
//		CE : Cannot make a static reference to the non-static field sid
//		Accessing the instance data by using Object Reference variable 
		System.out.println("Student ID : " + srinu.sid);// 0 -->101
		System.out.println("Student name: " + srinu.sname);// null --> "Srinivas S"

	}

}
