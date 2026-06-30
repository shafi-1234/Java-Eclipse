package com.basics;

public class Test2 {

	static {
		System.out.println("static block1 loaded ");
	}

	static Test2 t = new Test2();

	public static void main(String[] args) {
		System.out.println("main method started ");
	}

	{
		System.out.println("instance block1 loaded ");
	}

	static {
		System.out.println("static block2 loaded ");
	}

	{
		System.out.println("instance block2 loaded ");
	}

}
