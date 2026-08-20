package com.ArraysTwoD;

import java.util.Scanner;

public class ConsoleInputInsertion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int coloumn=sc.nextInt();
		int arr[][] = new int[rows][coloumn];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumn;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumn;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
