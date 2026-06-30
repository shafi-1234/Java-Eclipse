package com.basics
;

public class Test3Demo1 {

	static int id = 123;

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());
		hello();
		Test3Demo1 t = new Test3Demo1();
		t.welcome();
		
		System.out.println("main method ended ");
	}

	static void hello() {
		System.out.println("Hello !! Good Morning ");
		System.out.println("Hello !! Good Morning ");
		System.out.println("Hello !! Good Morning ");
		System.out.println(Thread.currentThread());
	}

	void welcome() {
		System.out.println("Welcome to Java World !");
		System.out.println(Thread.currentThread());
	}

}
