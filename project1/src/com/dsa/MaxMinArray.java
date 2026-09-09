package com.dsa;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[]= {1,7,8,3,9,0,2};
		int n =arr.length;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else {
				min=arr[i];
			}
		}
		System.out.println("Maximum Number : "+max);
		System.out.println("Minimum Number : "+min);
		
	}

}
