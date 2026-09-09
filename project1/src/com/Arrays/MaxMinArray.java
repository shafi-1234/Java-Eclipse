package com.Arrays;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int smax=Integer.MIN_VALUE;
		int smin=Integer.MAX_VALUE;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Size of array : ");
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}else if(arr[i]>smax && arr[i]!=max ) {
				smax=arr[i];
			}
			if(arr[i]<min) {
				smin=min;
				min=arr[i];
			}else if(arr[i]<smin && arr[i]!=min) {
				smin=arr[i];
			}
		}
		System.out.println("Max Value : "+max);
		System.out.println("Min Value : "+min);
		System.out.println("Second Max Value : "+smax);
		System.out.println("Second Min Value : "+smin);
	}

}
