package com.dsa;

public class TwoDarray {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][4];
//		int rowsize=arr.length;
//		int cloSize=arr[rowsize-1].length;
//		System.out.println("Row Size : "+rowsize);
//		System.out.println("Coloumn Size : "+cloSize);
		
		arr[0][0]=1;
		arr[1][1]=1;
		arr[2][2]=1;
//		arr[3][3]=1; // out of bound error
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
