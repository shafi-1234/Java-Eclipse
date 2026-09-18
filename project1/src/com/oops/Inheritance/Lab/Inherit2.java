package com.oops.Inheritance.Lab;

class person{
	String name;
	int age;
	
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

class student extends person{
	String clgName;
	public student(String name,int age,String clgName) {
		super(name,age);
		this.clgName=clgName;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(clgName);
	}
	
}
public class Inherit2 {

	public static void main(String[] args) {
		student s = new student("Shafi",21,"Vcube");
		s.display();

	}

}
