package com.dsa;

import java.util.Arrays;

public class StringArray {
	public static void main(String args[]) {
		String arr[]= {"Mahammad Shafi","Shafi","rafi","Ali"};
		int n =arr.length;
		String greater=arr[0];
		for(int i=0;i<n-1;i++) {
			if(checkLength(arr[i])>checkLength(greater)) {
				greater=arr[i];
			}
		}
		System.out.println("Greater String  : "+greater);
		
	}
	static int checkLength(String n) {
		int len=n.length();
		return len;
	}

}
