package com.oops;

public class StudentInformation {

	public static void main(String[] args) {
		CollegeInformation s1= new CollegeInformation();
		s1.setClgId(1);
		s1.setClgName("Vucbe");
		s1.setStudentName("Shafi");
		
		System.out.println("College Id : "+s1.getClgId());
		System.out.println("College Name : "+s1.getClgName());
		System.out.println("College Student Name : "+s1.getstudentName());

	}



}
