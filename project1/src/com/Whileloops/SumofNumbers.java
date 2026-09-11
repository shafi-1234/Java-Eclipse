package com.Whileloops;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber : ");
		int n =sc.nextInt();
		System.out.println("The Given Number is : "+n);
		// Sum of N Number 
		System.out.println("The Sum of "+n+" is : "+sumOfNNUmbers(n));
		// Reverse Of A Number 
		System.out.println("The Reverse of "+n+" is : "+reverseOfNumber(n));
		// Is Palindrome
		if(isPalindrome(n)) {
		System.out.println("The Given Number "+n+" is palindrome");
		}else {
			System.out.println("The Given Number "+n+" is Not palindrome");
		}
		
		// Amastrong Number 
		if(isAmstrong(n)) {
			System.out.println("Given Number is Amastrong ");
		}else {
			System.out.println("Given Number is Not Amastrong ");
		}
		// Greater Number
		System.out.println("Greater Number is : "+largestDigit(n));
		
		// Smaller Number 
		System.out.println("Smaller Number is : "+smallerDigit(n));
		
		// How Many Zeroes in n
		System.out.println("Count of 0 in "+n+" is : "+countOf0(n));
		
		// Perfect Number 
		if(isPerfect(n)) {
			System.out.println(n+" is a Perfect Number ");
		}
		else {
			System.out.println(n+"is Not a Perfect ");
		}
		// Magic Number
		if(isMagic(n)) {
			System.out.println(n+" Magic Number ");
		}else {
			System.out.println(n+" is not a Magic Number");
		}
		// Happy Number
		if(isHappy(n)) {
			System.out.println(n+" Happy Number");
		}else {
			System.out.println(n+" Not Happy Number");
		}
	}
	static int sumOfNNUmbers(int n ) {
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum+=rem;
		}
		
		return sum;
	}
	
	static int reverseOfNumber(int n ) {
		int rev=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		return rev;
	}
	
	static boolean isPalindrome(int n ) {
		boolean status=false;
		int org=n;
		if(reverseOfNumber(n)==org) {
			return true;
		}
		return status;
	}
	static boolean isAmstrong(int n ) {
		int org=n;
//		int count=0;
		int res=0;
		int rem=0;
		int temp=n;
//		while(temp>0) {
//			count++;
//			temp/=10;
//		}
		String digcount = Integer.toString(n);
		int count=digcount.length();
		temp=n;
		while(temp>0) {
			rem=temp%10;
//			res=res+(int)Math.pow(rem, count);
			res=res+Math.powExact(rem,count);
			temp /=10;
		}
		return org==res; 
	}
	static int largestDigit(int n) {
		int res=0;
		int rem=0;
		int max=0;
		while(n>0) {
			rem=n%10;
			if(rem>max) {
				max=rem;
			}
			n=n/10;
			
		}
		return max;
		
	}
	static int smallerDigit(int n ) {
		int rem=0;
		int min=Integer.MAX_VALUE;
		while(n>0) {
			rem=n%10;
			if(rem<min) {
				min=rem;
			}
			n=n/10;
			
		}
		return min;
	}
	
	static int countOf0(int n) {
		int countof=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			if(rem==0) {
				countof++;
			}
			n=n/10;
		}
		return countof;
	}

	static boolean isPerfect(int n) {
		boolean status=false;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
			
		}
		if(sum==n) {
			status=true;;
		}
		return status;
	}
	static boolean isMagic(int n) {
		boolean status=false;
		int rem=0;
		int sum=0;
		do {
			sum=0;
			while(n>0) {
				rem=n%10;
				n=n/10;
				sum+=rem;
			}
			n=sum;
		}while(sum>9);
		if(sum==1) {
			status = true;
		}
		return status;
	}
	
	static boolean isHappy(int n) {
		boolean status=true;
		int rem=0;
		int sum=0;
		do {
			sum=0;
			while(n>0) {
				rem=n%10;
				n=n/10;
				sum=sum+rem*rem;
			}
			n=sum;
		}while(sum>9);
		if(sum==1) {
			status=true;
		}
		return status;
	}
}
