package com.engineeringanimuthyam.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurrenceOfStringElement {
	
	public static void main(String[] args) {
	Map<String, Integer>	hm=new HashMap<>();
	
	String arr[]= {"Hi","Bye","Munni","Chinni","Hi","Kanna"};
	
	for(int i=0;i<=arr.length-1;i++) {
		String key=arr[i];
		/*
		 * if(hm.containsKey(key)) { int freq=hm.get(key); hm.put(key, freq+1); } else {
		 * hm.put(key, 1); }
		 */
		
		//To replace all the above code with the below..
		hm.put(key,hm.getOrDefault(key, 0)+1);
		
		
	}
	
		for(Entry<String, Integer> re:hm.entrySet()) {
			System.out.println(re.getKey()+"-----"+re.getValue());
		}
	
		
	}

}
