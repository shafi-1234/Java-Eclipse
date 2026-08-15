package com.dsa;

import java.util.Scanner;
//Example: 25
//25² = 625
//625 ends with 25

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isAutomorphicNumber(n)) {
			System.out.println("Auto Morphic Number");
		}else {
			System.out.println("Not Auto Morphic Number");
		}
		
	}
	static boolean isAutomorphicNumber(int n) {
		boolean status=false;
		int rem=0;
		int org=n;
		int square=n*n;
		rem=square%100;
		if(rem==org) {
			status=true;
		}
		return status;
	}
	

}
