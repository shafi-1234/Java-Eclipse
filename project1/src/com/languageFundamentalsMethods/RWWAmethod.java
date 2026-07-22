package com.languageFundamentalsMethods;

public class RWWAmethod {

	public static void main(String[] args) {
		//Return With Arguments
		System.out.println("Main Method Started");
		int Sub=sub(10,6);
		System.out.println("Subtraction : "+Sub);
		
		RWWAmethod t= new RWWAmethod();
		int Sum=t.sum(10, 6);
		System.out.println("Addition : "+Sum);
		

	}
	
	int sum(int a,int b) {
		return a+b;
	}

	static int sub(int a,int b) {
		return a-b;
	}
}
