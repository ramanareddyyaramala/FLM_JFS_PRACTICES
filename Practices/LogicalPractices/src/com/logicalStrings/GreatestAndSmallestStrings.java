package com.logicalStrings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GreatestAndSmallestStrings {
	
	public static void greatestAndSmallest(String[] str) {
		
		int len=str.length;
		
		String smallest=str[0];
		String largest=str[0];
		
		/*
		 * for(int i=0;i<len;i++) {
		 * 
		 * if(str[i].length()<smallest.length()) { smallest=str[i]; }
		 * 
		 * if(str[i].length()>largest.length()) { largest=str[i]; }
		 * 
		 * }
		 */
		
		if(str.length==0) {
			System.out.println("The array is empty..");
		}
		List<String> smallestw=new LinkedList<>();
		List<String> greatestw=new LinkedList<>();
		
		for(String word:str) {
			
			if(word.length()>largest.length()) {
				largest=word;
				
			}
			
			if(word.length()<smallest.length()) {
				smallest=word;
			}
			
		}
		
		
	
		
		for(String word:str) {
			if(word.length()==smallest.length() && !smallestw.contains(word)) {
				smallestw.add(word);
			}
			else if(word.length()==largest.length() && !greatestw.contains(word)) {
				greatestw.add(word);
			}
		}
		System.out.println(smallestw);
		System.out.println(greatestw);
	}
		
	public static void main(String[] args) {
		
		
		String str[]={"ramana","reddy","reddy","ankitha","vanda"};
		
		greatestAndSmallest(str);
		
	
	}
	//we can use this code even we have the ddupilicates in the string array..
}
