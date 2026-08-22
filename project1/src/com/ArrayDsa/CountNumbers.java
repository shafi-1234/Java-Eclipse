package com.ArrayDsa;

public class CountNumbers {

	public static void main(String[] args) {
		int arr[]= {7,0,2,-1,2,0,-2,-8};
		int count0=0;
		int countpos=0;
		int countNeg=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				countpos++;
			}else if(arr[i]<0) {
				countNeg++;
			}
			else {
				count0++;
			}
			
		}
		System.out.println("Count of 0s in Array : "+count0);
		System.out.println("Count of Positives in Array : "+countpos);

		System.out.println("Count of Negatives in Array : "+countNeg);

	}

}
