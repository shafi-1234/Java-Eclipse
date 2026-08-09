package com.LabTask;

public class arrDiscount {

	public static void main(String[] args) {

		int prices[]= {8,4,6,2,3};
		int n =prices.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(prices[j]<=prices[i]) {
					prices[i]-=prices[j];
					break;
				}
			}
		}
		for(int price : prices) {
			System.out.print(price+" ");
		}
	}

}
