package com.LabTask;

public class Swapping {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		
		//method 1;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("A : "+a);
//		System.out.println("B : "+b);
		
		//method 2
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("A : "+a);
//		System.out.println("B : "+b);
		
		//method 3
		a=(a^b);
		b=(a^b);
		a=a^b;
		
////		
		
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		
		
		
	}

}
