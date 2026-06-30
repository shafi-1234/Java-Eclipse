package com.basics
;

public class Test4Demo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		method1();

	}

	// In static methods, we can call static methods directly
	static void method1() {
		method2();
		System.out.println("Hello method1");
	}

//	In static methods, we need to create Objects to call instance methods.
	static void method2() {

		Test4Demo2 t = new Test4Demo2();
		t.method3();
		System.out.println("Hello method2");
	}

	// In instance methods, we can instance methods directly
	void method3() {
		method4();
		System.out.println("Hello method3");
	}

//	in instance methods, can we call static methods directly ..? 
	void method4() {
		method5();
		System.out.println("Hello method4");
	}

	static void method5() {
		System.out.println("Hello method5");
	}

}
