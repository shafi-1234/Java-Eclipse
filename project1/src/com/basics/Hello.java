package com.basics;

import java.util.Scanner;



public class Hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !");

//		Bootstrap class loader is loading below classes 
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");

//		Application class loader is loading below classes 
//		Loading the classes from Secondary memory to Primary memory : Reflection API
		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.javaintro.Employee");

		System.out.println("main method ended !");
	}
}
