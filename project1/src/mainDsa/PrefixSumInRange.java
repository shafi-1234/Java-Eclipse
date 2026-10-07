package mainDsa;

import java.util.Arrays;

public class PrefixSumInRange {
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50};
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		int l=2;
		int r=4;
		int sum=0;
		if(l==0) {
			sum=prefix[r];
		}else {
			sum=prefix[r]-prefix[l-1];
		}
		System.out.println("Prefix Sum : " +Arrays.toString(prefix));
		System.out.println("The Sum of range between "+l+" and "+r+" is "+sum);
	}

}
