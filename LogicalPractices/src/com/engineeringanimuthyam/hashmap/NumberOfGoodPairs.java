package com.engineeringanimuthyam.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
	
	public static int numberPairs(int arr[]) {
		int len=arr.length;
		int count=0;
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i<j) {
					if(arr[i]==arr[j]) {
						map.put(arr[i],arr[j]);
						count++;
					}
					
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,1,3};
		int res=numberPairs(arr);
		System.out.println(res);
		
	}
	
	
}
