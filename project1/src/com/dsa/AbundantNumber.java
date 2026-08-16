package com.dsa;

//Example: 12
//Proper divisors:
//1, 2, 3, 4, 6
//Sum:1 + 2 + 3 + 4 + 6 = 16
//16 > 12

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter A Number ");
		int n =sc.nextInt();
		if(isAbundantNumber(n)) {
			System.out.println(n+" is Abundant Number");
		}else {
			System.out.println(n+" is Not Abundant Number");
		}

	}
	static boolean isAbundantNumber(int n) {
		boolean status=false;
		int org=n;
		int rem=0;
		int divisor=0;
		int sum=0;
		// using While Loop
		int i=1;
		while(i<n) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
//		for(int i=1;i<=n;i++) {
//			 rem=n%i;
//			 if(rem==0) {
//				 divisor=i;
//				 sum+=divisor;
//				
//			 }
//			
//		}
		
		if(sum>org) {
			status=true;
		}
		return status;
		
	}

}
