package com.dsa;
//Example: 123
//Sum:1 + 2 + 3 = 6
//Product:1 × 2 × 3 = 6
//Therefore, 123 is a Spy Number.
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		if(isSpyNumber(n)) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not A Spy Number");
		}
		
	}
	static boolean isSpyNumber(int n ) {
		boolean status=false;
//		int org=n;
		int rem=0;
		int sum=0;
		int product=1;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			product *= rem;
			n=n/10;
		}
		if(sum==product) {
			status=true;
		}
		return status;
	}

}
