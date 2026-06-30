package com.basics
;

//Anonymous Object creation 
public class Test5Demo {

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {

		new Test5Demo().method1();
		System.gc();
	}
}
