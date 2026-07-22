package com.languageFundamentalsMethods;

public class RWNAmethod {

	public static void main(String[] args) {
		// Return With - No Arguments
		System.out.println("Main Method Started");
		
		int sum=Sum();
		System.out.println(sum);
		
		RWNAmethod t= new RWNAmethod();
		int Sub=t.sub();
		System.out.println(Sub);

	}
	
	
	static int Sum(){
		int a=10;
		int b=20;
		
		return a+b;	
	}
	
	int sub() {
		int a =10;
		int b=20;
		
		return b-a;
	}

}
