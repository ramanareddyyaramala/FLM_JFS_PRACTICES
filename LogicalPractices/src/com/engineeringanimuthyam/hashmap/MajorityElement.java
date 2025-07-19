package com.engineeringanimuthyam.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static void main(String[] args) {
		Map<Integer, Integer>  hm=new HashMap<>();
		
		int arr[]= {2,1,3,3,1,5,1,1};
		int len=arr.length;
		//int half=len/2;
		//System.out.println(half);
		for(int i=0;i<len;i++) {
			int num=arr[i];
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		
		for(int res:hm.keySet()) {
			if(len/2<=hm.get(res)) {
			System.out.println(hm.get(res));
		}
		
	}

}
}
