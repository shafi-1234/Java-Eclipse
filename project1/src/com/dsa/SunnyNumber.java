package com.dsa;

import java.util.Scanner;

//A number is a Sunny Number if the number + 1 is a perfect square.
//Example: 8
//8 + 1 = 9
//9 = 3²
//Therefore, 8 is a Sunny Number.

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isSunnyNumber(n)) {
			System.out.println(n+" is Sunny Number");
		}else {
			System.out.println(n+" is Not Sunny Number");
		}
		
	}
	static boolean isSunnyNumber(int n) {
		boolean status=false;
		int newNum=n+1;
		int org=newNum;
		
		int perfect=(int)Math.sqrt(newNum);
//		System.out.println(perfect);
		if(perfect*perfect==org) {
			status=true;
		}
		return status;
	}
	

}
