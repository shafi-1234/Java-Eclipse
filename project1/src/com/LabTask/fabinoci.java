package com.LabTask;

import java.util.Scanner;

public class fabinoci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range of fobinoci series : ");
		int n =sc.nextInt();
		fibinociSeries(n);

	}
	static void fibinociSeries(int n ) {
		int n1=0;
		int n2=1;
		int n3=0;
		int temp=0;
		for(int i=0;i<n-2;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			if(i==5) {
				temp=n3;
			}
		}
		System.out.println();
		System.out.print(temp);

		
	}

}
