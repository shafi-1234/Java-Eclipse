package com.basics
;

public class Bike {

	// Dynamic Dispatching
	@Override
	protected void finalize() {
		System.out.println("Object destroyed ");
	}

	void hello() {
		System.out.println("Hello ");
	}

	void show(){
		Bike b = new Bike();//Object creation inside the method 
	}
	
	public static void main(String[] args) {
		System.out.println("main method started ");

		Bike fz = new Bike();
		Bike re = new Bike();//1
		Bike hero = new Bike();

		System.out.println(fz);
		System.out.println(re);
		System.out.println(hero);

		fz = null;// Nullifying

		Bike tvs = new Bike();//2
		tvs = hero; // Re-assignment

		new Bike(); // Anonymous Object
		
		tvs.show();

		System.gc();

		System.out.println(fz);
		System.out.println(re);
		System.out.println(hero);
		System.out.println(tvs);

	}

}
