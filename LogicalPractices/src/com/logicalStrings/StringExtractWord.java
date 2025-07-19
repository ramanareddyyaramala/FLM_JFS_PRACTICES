package com.logicalStrings;

public class StringExtractWord {
	
	public static String getExtractWord(String str) {
		String eword=null;
		if(str.contains("world")) {
			int y=str.indexOf("world");
			
			 eword=str.substring(y, y+"world".length());
			
		}
		
		return eword;
		
		
	}
	
	

	public static void main(String[] args) {
		String str="Hello world!";
		String exword=StringExtractWord.getExtractWord(str);
		System.out.println(exword);
		
	}
	
	
	
}
