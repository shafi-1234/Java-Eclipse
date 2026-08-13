package com.LabTask;

public class studentChaining {

	int stuID;
	String stname;
	String courseName;
	public studentChaining() {
		this(5);
	}
	public studentChaining(int stuId) {
		this(stuId,"shafi");
	}
	
	public studentChaining(int stuId,String stname) {
		this(stuId,stname,"jfs");
	}
	
	
	public studentChaining(int stuID, String stname, String courseName) {
		
		this.stuID = stuID;
		this.stname = stname;
		this.courseName = courseName;
	}
	
	
	void show() {
		System.out.println("Student ID : "+stuID);
		System.out.println("Student Name : "+stname);
		System.out.println("Course Name : "+courseName);
		System.out.println("----------------------------------");
	}
	
	public static void main(String[] args) {
		studentChaining s1= new studentChaining();
		s1.show();
		studentChaining s2= new studentChaining(6,"Ali");
		s2.show();
		studentChaining s3= new studentChaining(7,"rafi","pfs");
		s3.show();

	}

}
