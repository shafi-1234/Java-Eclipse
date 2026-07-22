package com.languageFundamentalsMethods;

public class NRWAmethod {

	public static void main(String[] args) {
		// No Return - With Argument
		add(5,5);
		NRWAmethod t = new NRWAmethod();
		t.sub(5,5);

	}

	static void add(int a ,int b) {
		System.out.println("Addition is : "+a+b);
		
	}
	void sub(int a,int b) {
		System.out.println("Subtraction is : "+(a-b));
	}
}
