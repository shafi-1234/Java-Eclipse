package com.dsa;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The range Number : ");
		int n =sc.nextInt();
		
		for(int number =1;number<=n;number++) {
			int sum=0;
			for(int i=1;i<number ;i++) {
				if(number%i==0) {
					sum+=i;
				}
				
			}
			if(sum==number) {
				System.out.println(sum);
			}
		}
		
	}

}
