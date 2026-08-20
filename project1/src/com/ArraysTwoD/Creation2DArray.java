package com.ArraysTwoD;

public class Creation2DArray {

	public static void main(String[] args) {

		// For Creating 2D Array
		// int[][] arr= new int[rowSize][coloumnSize]
		int arr[][]= new int[3][4];
		
		System.out.println("Row  length : "+arr.length);//3
		System.out.println("Coloumn Length : "+arr[0].length);//4
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=5;
		
		arr[1][0]=3;
		arr[1][1]=2;
		arr[1][2]=1;
		
		
		arr[2][0]=2;
		arr[2][1]=2;
		arr[2][2]=1;
		arr[2][3]=3;
		
//		for(int[] a1:arr) {
//			for(int a:a1) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
