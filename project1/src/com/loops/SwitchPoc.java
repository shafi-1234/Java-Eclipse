package com.loops;

import java.util.Scanner;

public class SwitchPoc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.  Prime Number");
		System.out.println("2.  Fibonacci Series");
		System.out.println("3.  Factorial");
		System.out.println("4.  Palindrome Number");
		System.out.println("5.  Armstrong Number");
		System.out.println("6.  Reverse Number");
		System.out.println("7.  Sum of Digits");
		System.out.println("8.  Perfect Number ");
		System.out.println("9.  Neon Number ");
		System.out.println("10. Magic number");
		System.out.println("11. Happy NUmber");
		
		System.out.println("Enter Your choice :");
		int choice = sc.nextInt();
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		
		switch(choice) {
		
		//1. Prime Number
		case 1:
			boolean status=true;
			if(n==0 ||n==1) {
				status=false;
			}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					status=false;
				}
			}
			if(status) {
				System.out.println("Prime Number ");
			}else {
				System.out.println("Not a Prime Number");
			}
			break;
			
		//2. Fibonacci Series
		case 2:
			int a=0;
			int b=1;
			for(int i=1;i<=n;i++) {
				System.out.println(a+" ");
				int c=a+b;
				a=b;
				b=c;
				
			}
			break;
		
		//3. Factorial
		case 3:
			int fact=1;
			for(int i=n;i>=1;i--) {
				fact=fact*i;
			}
			System.out.println(fact);
			break;
		
		// 4. Palindrome Number
			
		case 4:
			int org=n;
			int rev=0;
			int rem=0;
			while(n>0) {
				rem=n%10;
				n=n/10;
				rev=rev*10+rem;
			}
			if(rev==org) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not a palindrome");
			}
			break;
			
		// 5. Armstrong Number
		case 5:
			int org1=n;
			int rem2=0;
			int sum=0;
			String digcount=Integer.toString(n);
			int count=digcount.length();
			while(n>0) {
				rem2=n%10;
				sum=sum+Math.powExact(rem2,count);
				n=n/10;
			}
			if(sum==org1) {
				System.out.println("Amastrong");
			}else {
				System.out.println("Not Amastrong");
			}
			
			break;
			
		// 6. Reverse Number
		case 6:
			int rem3=0;
			int rev1=0;
			while(n>0) {
				rem3=n%10;
				n=n/10;
				rev1=rev1*10+rem3;
			}
			System.out.println(rev1);
			break;
			
		//7. Sum of Digits
		case 7:
			int sumofD=0;
			int sum1=0;
			while(n>0) {
				int rem4=n%10;
				 sum1+=rem4;
				 n=n/10;
			}
			System.out.println(sum1);
			break;
			
		//8. Perfect Number
		case 8:
			int orgi=n;
			int sum2=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum2+=i;
				}
			}
			if(sum2==orgi) {
				System.out.println("Perfect Number");
			}else {
				System.out.println("Not a Perfect Number");
			}
			break;
			
		//9. Neon Number 
		case 9:
			int orginal=n;
			int square =n*n;
			int reme;
			int sumN=0;
			while(square>0) {
				reme=square%10;
				sumN+=reme;
				square=square/10;
			}
			if(sumN==orginal) {
				System.out.println("Neon Number ");
			}else {
				System.out.println("Not a neon Number");
			}
			break;
			
		// 10.Magic Number
		case 10:
				int remen=0;
				int sum3=0;
				do {
					sum3=0;
					while(n>0) {
						remen=n%10;
						n=n/10;
						sum3+=remen;
					}
					n=sum3;
					
				}while(sum3>9);
				if(sum3==1) {
					System.out.println("Magic Number");
				}else {
					System.out.println(" not Magic Number");
				}

			break;
		// 11. Happy NUmber
		case 11:
			int reminder=0;
			int sum5=0;
			do {
				sum5=0;
				while(n>0) {
					reminder=n%10;
					sum5+= reminder*reminder;
					n=n/10;
					
				}
				n=sum5;
			}while(sum5>9);
			if(sum5==1) {
				System.out.println("Happy Number");
			}else {
				System.out.println("Not Happy Number");
			}
			break;
			
		default:
			System.out.println("Invalid choice");
		}

	}

}
