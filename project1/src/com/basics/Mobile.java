package com.basics;

public class Mobile {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Mobile op = new Mobile();

//		 Address of the Object
//		com.javaintro.Mobile@2b2fa4f7
//		2b2fa4f7 --> Hexa-Decimal value of an Object
		System.out.println(op);
		System.out.println(op.hashCode());//724542711
		
		int a = 0x2b2fa4f7;
		System.out.println(a);//724542711
		

	}

}
