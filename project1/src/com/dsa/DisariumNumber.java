package com.dsa;

import java.util.Scanner;
//Example: 135
//1¹ = 1
//3² = 9
//5³ = 125
//Sum:1 + 9 + 125 = 135
//Therefore, 135 is a Disarium Number.
public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isDisariumNumber(n)) {
			System.out.println("Disarium Number");
		}else {
			System.out.println("Not Disarium Number");
		}
	}
	
	static boolean isDisariumNumber(int n) {
		boolean status=false;
		int rem=0;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			rem=n%10;
			String digCount=Integer.toString(n);
			int count=digCount.length();
			
			n=n/10;
			sum+=Math.powExact(rem, count);
			
		}
		if(sum==temp) {	
			status=true;
		}
		return status;
	}

}
