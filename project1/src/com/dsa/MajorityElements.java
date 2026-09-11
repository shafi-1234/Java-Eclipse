package com.dsa;

import java.util.HashMap;

public class MajorityElements {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,3,3};
		HashMap<Integer,Integer>map=new HashMap<>();
		int n =arr.length;
		for(int i=0;i<n;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		int majority=arr[0];
		for(int key:map.keySet()) {
			if(map.get(key)>map.get(majority)) {
				majority=key;
			}
		}
		System.out.println("Majority Element : "+majority);

	}

}
