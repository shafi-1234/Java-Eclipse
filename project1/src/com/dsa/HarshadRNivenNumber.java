package com.dsa;

import java.util.Scanner;

//Example: 18
//Sum of digits:
//1 + 8 = 9
//18 ÷ 9 = 2
//No remainder, so 18 is a Harshad Number.
public class HarshadRNivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isHarshadRNivenNumber(n)) {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("Not Harshad number");
		}
	}
	static boolean isHarshadRNivenNumber(int n) {
		boolean status=false;
		int rem=0;
		int rem1=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			
			n=n/10;
		}
		rem1=n%sum;
		if(rem1==0) {
			status=true;
		}
		return status;
	}

}
