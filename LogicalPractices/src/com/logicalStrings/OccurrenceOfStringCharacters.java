package com.logicalStrings;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfStringCharacters {

	
	public static void main(String[] args) {
		
		String str="banana";
		
		String s1="I am here";
		
		String[] sarr=s1.split("\\s+");
		int count=sarr.length;
		System.out.println(count);
		
		Map<Character, Integer> frequency=new HashMap<>();
		
		for(char s:str.toCharArray()) {
			frequency.put(s,frequency.getOrDefault(frequency, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> m:frequency.entrySet()) {
			System.out.println(m.getKey()+"----"+m.getValue());
		}
		
		System.out.println(frequency);
	}
	
}
