package com.logicalStrings;

public class ReverseaWordIntsPosition15 {
	
	public static String reversetheposition(String str) {
		
		String[] word=str.split(" ");
		
		int len=word.length;
		StringBuilder revsent=new StringBuilder();
		for(int i=0;i<len;i++) {
			String s=word[i];
			String rev=new StringBuffer(s).reverse().toString();
			revsent.append(rev).append(" ");
		}
		
		return revsent.toString().trim();
		
		
	}
	
	public static void main(String[] args) {
		String str="The way we define";
		String res=reversetheposition(str);
		System.out.println(res);
		
	}

}
