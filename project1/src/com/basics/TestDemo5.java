package com.basics;

public class TestDemo5 {

//	Native methods do not specify a body
//	native void hello();

	void welcome() {
		System.out.println("Welcome !");
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
//		System.out.println(10 / 0);

		TestDemo5 t = new TestDemo5();
//		t.hello();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		t.welcome();
		
	}

}
