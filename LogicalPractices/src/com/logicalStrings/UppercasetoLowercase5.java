package com.logicalStrings;

public class UppercasetoLowercase5 {

	public String upperCase(String str) {
		StringBuilder lowerstring=new StringBuilder();
		int len=str.length();
		
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			
			if( ch>='A' && ch<='Z') {//check if character is upper case
				char c=(char)(ch+32);
				
				System.out.println(c);
				
			}
			
			lowerstring.append(ch);//otherwise it will convert to as original..
			
		}
		
		
		
		
		
		return lowerstring.toString();
	}
	public static void main(String[] args) {
		String str="RAMANAREDDY";
	UppercasetoLowercase5 up=	new UppercasetoLowercase5();
						String s=	up.upperCase(str);
		System.out.println(s);
	}
	
	
	public static void main3(String[] args) {
		//traditional mehtod to convert into the uppercase..
		String str="ramanareddy";
		String str2=str.toUpperCase();
		System.out.println(str2);
		
		char c='D';
		int i=(int)c;
		System.out.println(i);
		char d=(char)(c+32);
		System.out.println(d);
	}
}
