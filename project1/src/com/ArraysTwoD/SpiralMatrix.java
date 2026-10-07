package com.ArraysTwoD;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int arr[][]= {
				
////				1   2   3   4
//				5   6   7   8
//				9  10  11  12
//				13 14  15  16

//	op:1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		List<Integer> result=new ArrayList<>();
		int  top=0;
		int bottom=arr.length-1;
		int left=0;
		int  right=arr[0].length-1;
		
		while(top<=bottom && left<=right) {
			
//			left to right;
			for(int i=left;i<=right;i++) {
				result.add(arr[top][i]);
			}
			top++;
			
//			 top to bottom
			for(int i=top;i<=bottom;i++) {
				result.add(arr[i][right]);
			}
			right--;
			
//			right to left
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					result.add(arr[bottom][i]);
				}	
				bottom--;
			}
			
//			bottom to top
			if(left<=right) {
				for(int i=bottom ;i>=top;i--) {
					result.add(arr[i][left]);
				}
				left++;
			}	
		}
		
		System.out.println(result);
	}

}
