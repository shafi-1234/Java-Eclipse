package com.ArrayDsa;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		double avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=(double)sum/arr.length;
		System.out.println("Average Of Array : "+avg);
	}

}
