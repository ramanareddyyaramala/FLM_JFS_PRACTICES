package com.logicalStrings;

public class ReverseSomePart {
	public String reverseString(String sub,String str) {
		
		int len=sub.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			char ch=sub.charAt(i);
			String chtostr=String.valueOf(ch);
			rev=rev+chtostr;
		}
		int in=str.indexOf("reddy");
		
		String fsub=str.substring(in);
		
		return rev+fsub;
		
		
	}
	//This is my own logic..
	public static void main(String[] args) {
		String str="Ramanareddy";
		String sub=str.substring(0, 6);
		ReverseSomePart a= new ReverseSomePart();
		String res=a.reverseString(sub,str);
		
		System.out.println(res);
	}

}
