package com.Whileloops;

public class MissANumber {

	public static void main(String[] args) {
		int n=4513;
		int miss=5;
		int res=0;
		int place=1;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			if(rem==miss) {
				continue;
			}
			res=res+rem*place;
			place=place*10;
		}
		System.out.println(res);

	}

}
