package com.dsa;

//A number is Trimorphic if its cube ends with the original number.
//Example: 4
//4³ = 64
//64 ends with 4.
//Therefore, 4 is a Trimorphic Number.
//Another example:
//5³ = 125
//125 ends with 5.
//So, 5 is Trimorphic.

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
		if(isTrimorphicNumber(i)) {
			System.out.println(i+" is Trimorphic Number");
		
		}
		}

	}
	static boolean isTrimorphicNumber(int n) {
		boolean status=false;
		int temp=n;
		int rem=0;
		int cube=n*n*n;
		while(temp>0) {
			int rem1=temp%10;
			int rem2=cube%10;
			if(rem1==rem2) {
				status=true;
			}
			cube=cube/10;
			temp=temp/10;
		}
		
		
		
		return status;
	}
	

}
