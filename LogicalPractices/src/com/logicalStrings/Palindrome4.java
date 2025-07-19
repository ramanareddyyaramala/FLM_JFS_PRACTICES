package com.logicalStrings;

public class Palindrome4 {
	
	public boolean palindromeCheck(String str) {
		int length=str.length();
		char[] c=new char[length];
		
		for(int i=0;i<length;i++) {
			c[i]=str.charAt(length-i-1);
			
		}
		String pal=new String(c);
		
		if(str.equals(pal)) {
			return true;
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
		
		String str="dud";
		
		Palindrome4 pali=new Palindrome4();
		
	boolean b=	pali.palindromeCheck(str);
		System.out.println(b);
	}
	
}
