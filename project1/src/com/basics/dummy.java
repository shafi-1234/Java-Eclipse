package com.basics;

public class dummy {
	
	
//	Variables
	static String a="Static Variable";
	String b="Instance Variable";
	
	
	
//	Static Block
	static {
		System.out.println("Static Block");
	}
	
	
	
//	 instace Bolck
	{
		System.out.println("Instance Block");
	}
	
	
//	 Main Method
	  void main() {
		System.out.println("Main Method Started ");
		System.out.println(a);
		
		dummy du= new dummy();
		du.d();
		System.out.println(du.b);
		c();
	}
	
	static void c() {
		System.out.println("Static Method");
		
	}
	void d() {
		System.out.println("Instance Method");
	}
	

}
