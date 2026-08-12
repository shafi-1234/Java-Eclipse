package com.LabTask;

public class vehicalconstructor {
	String name;
	int stuId;
	
	vehicalconstructor(){
		super();
		System.out.println("no arg Parent constructor");
	}

	public static void main(String[] args) {

		System.out.println("Parent class called");
		
		
	}

}
class car extends vehicalconstructor{
	public car(){
		super();
		System.out.println("no arg child constructor");
		
	}
	public static void main() {
		System.out.println("child class called");
		car c=  new car();
		
	}
	
}