package com.logicalStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeletedupilicateFromString16 {
	
	public static String deleteduplicate(String str) {
		
		
		
		char[] ch=str.toCharArray();
		Set<Character> set=new HashSet<>();
		String string="";
		for(char c:ch) {
			set.add(c);
		}
		
		int len=set.size();
		char res[]=new char[len];
		
		int i=0;
		for(char ca:set) {
			res[i++]=ca;
		}
		string=String.valueOf(res);
		
		return string;
	}
	
	public static void main(String[] args) {
		String str="ramanareddy";	
		
	String res=	deleteduplicate(str);
	System.out.println(res);
			
	}

}
