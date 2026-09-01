package com.dsa;

public class TargetSum {

	public static void main(String[] args) {
		int arr[]= {2,3,6,8,9,11,12};
		int n =arr.length;
		int target=15;
		int left=0;
		int right=n-1;
		int sum=0;
		boolean status=false;
		while(left<right) {
			 sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("[ "+arr[left]+","+ arr[right]+" ]");
				left++;
				right--;
				status=true;
				}
			else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		if(!status) {
			System.out.println("Pair Not Found !!");
		}
		

	}

}
