package com.logicalStrings;

public class StringExtractWord2 {
	
	public static String getExtractWord(String str) {
		
		String exword="Ramanareddy";
		String fexword=null;
		
		if(str.contains(exword)) {
			int y=str.indexOf(exword);
			
			fexword=str.substring(y,y+exword.length());
		}
		
		return fexword;
		
	}
	

	public static void main(String[] args) {
		String str="Yaramala Ramanareddy";
		String exword=StringExtractWord2.getExtractWord(str);
		System.out.println(exword);
		
	}
	
	
	
}
