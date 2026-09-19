package com.dsa;

public class MaxSubArrayPrime {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,5,7};
		int n =arr.length;
		int sum=0;
		int max_sum=0;
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])) {
				sum=sum+arr[i];
				if(sum>max_sum) {
					max_sum=sum;
				}
			}else {
				sum=0;
			}
		}
		System.out.println(max_sum);

	}
	
	static boolean isPrime(int i) {
		boolean status=true;
		if(i==0 || i==1) {
			status=false;
		}
		
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				status=false;
				break;
			}
			
		}
		return status;
	}

}
