package com.basics;

public class Laptop {

	@Override
	protected void finalize() {
		System.out.println("Object Destroyed !");
	}

	public static void main(String[] args) {

		Laptop dell = new Laptop();
		System.out.println(dell);// com.javaintro.Laptop@2b2fa4f7

		Laptop len = new Laptop();
		System.out.println(len);// com.javaintro.Laptop@1dbd16a6

		Laptop as = new Laptop();
		System.out.println(as);// com.javaintro.Laptop@7ad041f3

//		1) Nullifying the Object
		dell = null;
		len = null;
//		
//		Runs the garbage collector in the Java Virtual Machine.
		System.gc();
		
		System.out.println("-------------------------");
		System.out.println(dell);
		System.out.println(len);
		System.out.println(as);

	}

}
