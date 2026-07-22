package com.languageFundamentalsMethods;

public class basic_method {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		hello();//Beacuse it static so we can call directly
//		show(); we cant acces directly beacuse show()is instace method we cant access instace method in static method directly
//		 creating a object to acces show() instance method
		basic_method t= new basic_method();
		t.show();
		

	}
	void show() {
		System.out.println("Nothing To show");
	}
	
	static void hello() {
		System.out.println("Welcome to java");
	}
}
