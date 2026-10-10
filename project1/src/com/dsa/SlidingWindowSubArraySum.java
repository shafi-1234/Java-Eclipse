package com.dsa;

import java.util.Arrays;

public class SlidingWindowSubArraySum {

	public static void main(String[] args) {
		int arr[]= {7,1,2,3,5,5,5,7,8,};
		int n =arr.length;
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		int max=sum;
		int start=0;
		for(int i=k;i<n;i++) {
			sum=sum+arr[i]-arr[i-k];
			if(sum>max) {
				max=sum;
				start=i-k+1;
			}
		}
		System.out.println("Maximum Sum : "+sum);
		System.out.print("Maximum Sub Array : ");
		for(int i=start;i<start+k;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
