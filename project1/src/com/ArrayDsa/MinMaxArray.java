package com.ArrayDsa;

import java.util.Arrays;

public class MinMaxArray{
	public static void main(String args[]) {
		int arr[]= {9,1,2,6,4,8};
		int n =arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		int smax=Integer.MIN_VALUE;
		int smin=Integer.MAX_VALUE;
		
		int Tmax=Integer.MIN_VALUE;
		int Tmin=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				Tmax=smax;
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]!=max) {
				Tmax=smax;
				smax=arr[i];
			}
			else if(arr[i]>Tmax && arr[i]!=smax && arr[i]>max) {
				Tmax=arr[i];
			}
			if(arr[i]<min) {
				Tmin=smin;
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin && arr[i]!=min) {
				Tmin=smin;
				smin=arr[i];
			}
			else if(arr[i]<Tmin && arr[i]!=smin && arr[i]!=min) {
				Tmin=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----------------------------------------");
		System.out.println("Highest Element in Array : "+max);
		System.out.println("Lowest Element in Array : "+min);
		System.out.println("----------------------------------------");
		System.out.println("Second Highest Element in Array : "+smax);
		System.out.println("Second Lowest Element in Array : "+smin);
		System.out.println("----------------------------------------");
		System.out.println("Third Highest Element in Array : "+Tmax);
		System.out.println("Third Lowest Element in Array : "+Tmin);
		
	}
}