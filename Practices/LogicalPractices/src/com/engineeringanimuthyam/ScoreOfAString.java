package com.engineeringanimuthyam;

public class ScoreOfAString {
	
	public int scoreofString(String str) {
		int len=str.length();
		
		int a=0;
		int b=0;
		int ans=0;
		for(int i=0;i<len-1;i++) {
			 a=i;
			 b=i+1;
			 char first=str.charAt(i);
			 char second=str.charAt(i+1);
			 
			 int aascii=first;
			 int bascii=second;
			int temp=Math.abs( aascii-bascii);
			ans=ans+temp;
			
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		String str="hello";
		int a=new ScoreOfAString().scoreofString(str);
		System.out.println(a);
	}

}
