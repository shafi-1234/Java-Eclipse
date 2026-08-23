package com.dsa;

import java.util.Scanner;

public class factorialRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n =sc.nextInt();
		System.out.println("Factorial of a nnumber "+n+" is : "+fact(n));
		

	}

	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
