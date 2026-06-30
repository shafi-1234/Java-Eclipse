package com.basics;

public class Test1 {

	int id;
	String name;

	static int orgId;
	static String orgName;

	{
		System.out.println("Hello instance ");
	}

	// instance method
	void main() {
		System.out.println("main method started !");

		int id = 10;

		System.out.println(id);
		System.out.println(name);
		System.out.println(orgId);
		System.out.println(orgName);

	}

}
