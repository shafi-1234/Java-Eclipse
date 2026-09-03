	package com.dsa;
	
	import java.util.Scanner;
	//Example: 145
	//1! = 1
	//4! = 24
	//5! = 120
	//Sum = 1 + 24 + 120 = 145
	//So, 145 is a Strong Number.
	public class StrongNumber {
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n =sc.nextInt();
			for(int i=1;i<n;i++) {
			if(isStrong(i)) {
				System.out.println(i+" Strong Number");
			}
			}
		}

		static int fact(int Number ) {
			if(Number==0 || Number==1) {
				return 1;
			}
			return Number*fact(Number-1);
			 	
		}
		static boolean isStrong(int n) {
			boolean status=false;
			int org=n;
			int digit=0;
			int sum=0;
			while(n>0) {
				digit=n%10;
				sum+=fact(digit);
				n=n/10;
			}
			if(sum==org) {
				status=true;
			}
			return status;
		}
	
	}
