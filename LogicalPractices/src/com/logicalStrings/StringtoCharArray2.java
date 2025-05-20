package com.logicalStrings;

public class StringtoCharArray2 {
	
	public char[] stringtochararray(String str) {
		StringBuffer sb=new StringBuffer(str);
		int length=sb.length();
		char[] ch=new char[length];
		for(int i=0;i<length;i++) {
			ch[i]=sb.charAt(i);
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		String str="Yaramala";
		StringtoCharArray2 sm=new StringtoCharArray2();
		char[] s=sm.stringtoarray(str);
		for(char ch:s) {
			System.out.println(ch+" ");
		}
		
		
		}
	//builtin methods to create the array characters from the String..
	public static void main2(String[] args) {
		//built in methods..
		String s="yaramala";
		char[] c=s.toCharArray();
		
		System.out.println(c);
	}
	
	public char[] stringtoarray(String s) {
		
		int length=s.length();
		char[] c=new char[length];
		for(int i=0;i<length;i++) {
			c[i]=s.charAt(i);
		}
		
		
		return c;
	}

	public static void main1(String[] args) {
		//convert the string to char array..now the task 
		
		String s="Ramanareddy";
		StringtoCharArray2 c=new StringtoCharArray2();
		char[] cc=c.stringtoarray(s);
		
		//to get the character sequence..
		
		for(char ch:cc) {
			System.out.print(ch+" ");
		}
		
	}
	
}
