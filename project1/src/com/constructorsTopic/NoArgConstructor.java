package com.constructorsTopic;

public class NoArgConstructor {
	String name;
	// No Arg Constructor created by Devveloper
	NoArgConstructor(){
		this.name="Shafi";
		System.out.println("No Arg Constructor Called");
	}
	

	public static void main(String[] args) {

		NoArgConstructor d=new NoArgConstructor();
		System.out.println(d.name);
	}

}
