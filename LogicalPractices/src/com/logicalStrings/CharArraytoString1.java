package com.logicalStrings;

public class CharArraytoString1 {
	
	public String chararraytostriString1(char[] c) {
		
		StringBuilder sb=new StringBuilder();
		
		for(char ch:c) {
			sb.append(ch);
		}
		
		return sb.toString();//usinng of the stringbuilder;
	}
	
	
	public static void main(String[] args) {
		char[] c= {'s','t','r','i','n','g'};
		
		String s=new CharArraytoString1().chararraytostriString1(c);
		System.out.println(s);
	}
	
	
	
	
	public static void main1(String[] args) {
		
		char[] c= {'s','t','r','i','n','g'};
		
		CharArraytoString1 ch =new CharArraytoString1();
		
		String s=ch.chararraytoconverrtString(c);
		System.out.println(s);
		
	}
	public String chararraytoconverrtString(char[] c) {
		
		String s="";
		
		for(char ch:c) {
			s+=ch;
			
		}//from the char array the characters will be store in the string..
		return s;
		
	}

	
	
	
	
}
