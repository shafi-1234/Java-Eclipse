package com.ArrayDsa;

public class SumOfArrElements {

	public static void main(String[] args) {

		int arr[]= {1,2,1,2};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of Elements : "+sum);
	}

}
