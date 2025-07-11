package com.logicalStrings;

public class LowerToUpperCase6 {

	public String lowertoupperCase(String str) {
		StringBuilder sb=new StringBuilder();
		int len=str.length();
		
		
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				char c=(char)(ch-32);
				System.out.println(c);
				String s=String.valueOf(c);
				
			}
			 sb.append(ch);
			
		}
		
		
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String lowerstr="ramanareddy";
		
		LowerToUpperCase6 lo=new LowerToUpperCase6();
		String str=lo.lowertoupperCase(lowerstr);
		System.out.println(str);
	}
	
}
