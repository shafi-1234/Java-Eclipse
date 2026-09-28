package mainDsa;

import java.util.Arrays;

public class PreFixSum {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
			
		}
		System.out.println(Arrays.toString(prefix));
	}

}
