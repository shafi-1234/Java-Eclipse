package com.dsa;

public class MinMaxElementNumber {

	public static void main(String[] args) {

		int n=123456;
		int rem=0;
		System.out.println(n);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		int smax=Integer.MIN_VALUE;
		int smin=Integer.MAX_VALUE;
		
		int Tmax=Integer.MIN_VALUE;
		int Tmin=Integer.MAX_VALUE;
		
		while(n>0) {
			rem=n%10;
			if(rem>max) {
				Tmax=smax;
				smax=max;
				max=rem;
			}else if(rem>smax && rem!=max) {
				Tmax=smax;
				smax=rem;
			}
			else if(rem>Tmax && rem!=smax && rem!=max) {
				Tmax=rem;
			}
			if(rem<min) {
				Tmin=min;
				smin=min;
				min=rem;
			}
			else if(rem<smin && rem!=min) {
				Tmin=smin;
				smin=rem;
			}
			else if(rem<Tmin && rem!=smin && rem!=min) {
				Tmin=rem;
			}
			n=n/10;
		}
		
		System.out.println("----------------------------");
		System.out.println("Highest Value : "+max);
		System.out.println("Lowest Value : "+min);
		System.out.println("----------------------------");
		System.out.println("Second Highest Value : "+smax);
		System.out.println("Second Value : "+smin);
		System.out.println("----------------------------");
		System.out.println("Highest Value : "+Tmax);
		System.out.println("Lowest Value : "+Tmin);
		System.out.println("----------------------------");
	}

}
