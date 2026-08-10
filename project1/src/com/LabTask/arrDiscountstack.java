package com.LabTask;
import java.util.Stack;

public class arrDiscountstack {

	public static void main(String[] args) {
		int prices[]= {8,4,6,2,3};
		int n =prices.length;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<n;i++) {
			while(!stack.isEmpty()&&prices[stack.peek()]>=prices[i]) {
				int index=stack.pop();
				prices[index]-=prices[i];
			}
			stack.push(i);
		}
		for(int price : prices) {
			System.out.print(price+" ");
		}
	}

}
