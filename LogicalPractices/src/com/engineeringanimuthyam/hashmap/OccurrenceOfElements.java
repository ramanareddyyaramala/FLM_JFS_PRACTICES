package com.engineeringanimuthyam.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurrenceOfElements {
	
	public static void main(String[] args) {
		Map<Integer, Integer> hm=new HashMap<>();
		int arr[]= {2,3,2,1,4,5,1};
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
			if(hm.containsKey(num)) {
				int freq=hm.get(num);
				hm.put(num,freq+1);
			}
			else {
				hm.put(num,1);
			}
			
			
		}
		
		for(Entry<Integer, Integer> re:hm.entrySet()) {
			
			System.out.println(re.getKey()+"---"+re.getValue());
			
		}
		System.out.println("--This is another way--");
		
		for(Integer re1:hm.keySet()) {
			System.out.println(re1+"--------"+hm.get(re1));
		}
		
		
	}

}
