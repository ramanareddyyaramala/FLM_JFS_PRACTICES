package com.engineeringanimuthyam;

public class WordsInAString {
	
	
	public static int CountofWords(String s) {
		int len=s.length();
		int count=1;
		for(int i=0;i<len;i++) {
			
			char ch=s.charAt(i);
			
			if(ch==' ') {
				count++;
			}
			
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String s="I have a doubt on my life";
		int res=CountofWords(s);
		System.out.println(res);
		
	}

}
