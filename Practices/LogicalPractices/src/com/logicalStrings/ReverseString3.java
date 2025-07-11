package com.logicalStrings;

public class ReverseString3 {
	

	public  String reversestring(String str) {
		
		int length=str.length();
		char[] c=new char[length];
		
		  for(int i=0;i<length;i++) { c[i]=str.charAt(length-i-1); }
		 
		
		
		
		String s=new String(c);
		return s;
	}
	public static void main(String[] args) {
		String str="ramanareddy";
		
		ReverseString3 rev=new ReverseString3();
		String ss=rev.reversestring(str);
		
		System.out.println(ss);
		
	}
	public static void main1(String[] args) {
		String s="ramanareddy";
		StringBuilder sb=new StringBuilder(s).reverse();
		System.out.println(sb);
	}
}
