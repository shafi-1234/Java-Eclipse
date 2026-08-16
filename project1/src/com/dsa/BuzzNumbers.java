package com.dsa;

//A number is a Buzz Number if:
//It is divisible by 7, OR
//Its last digit is 7.
//Example: 14
//14 is divisible by 7.
//Therefore, 14 is a Buzz Number.

import java.util.Scanner;

public class BuzzNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =sc.nextInt();
		if(isBuzzNumbers(n)) {
			System.out.println(n+" is Buzz Number");
		}else {
			System.out.println(n+" is Not Buzz Numbers");
		}
		
	}
	static boolean isBuzzNumbers(int n) {
		boolean status=false;
		
		if(n%7==0 || n%10==7) {
			status=true;
		}
		return status;
	}

}
