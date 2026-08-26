package com.Arrays;

import java.util.Arrays;

public class MergeThreeArrays {
	public static void main(String args[]) {
		int a1[]= {7,2,1,3,4};
		int a2[]= {2,1,5,4};
		int a3[]= {1,2,8,7,6,9};
		int a4[]= new int[a1.length+a2.length+a3.length];
		
		for(int i=0;i<a1.length;i++) {
			a4[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a4[a1.length+i]=a2[i];
		}
		for(int i=0;i<a3.length;i++) {
			a4[a1.length+a2.length+i]=a3[i];
		}
		System.out.println(Arrays.toString(a4));
//		System.out.println(a4.length);
	}

}
