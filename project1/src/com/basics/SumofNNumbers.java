package com.basics;

import java.util.Scanner;

public class SumofNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range Number : ");
		int n =sc.nextInt();
		int result=n*(n+1)/2;
		System.out.println("The sum of Numbers From 1 to "+n+" is "+result );

	}

}
