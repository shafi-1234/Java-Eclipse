package com.constructorsTopic;

public class DefaultConstructor {
	
// Defaul Connstructor Is created By Compailer Autometacally
	
	DefaultConstructor(){
		super();
	}
	
	int a;
	String s;
	double d;
	float f;
	

	public static void main(String[] args) {
		DefaultConstructor de= new DefaultConstructor();
		System.out.println(de.a);
		System.out.println(de.s);
		System.out.println(de.d);
		System.out.println(de.f);


	}

}
