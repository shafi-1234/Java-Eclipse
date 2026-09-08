package com.dsa;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,0,3};
		int n=arr.length;
		int eSum=n*(n+1)/2;
		int aSum=0;
		for(int i=0;i<n;i++) {
			aSum += arr[i];
			
		}
		int mis=eSum-aSum;
		System.out.println("Missing Number : "+mis);

	}

}
