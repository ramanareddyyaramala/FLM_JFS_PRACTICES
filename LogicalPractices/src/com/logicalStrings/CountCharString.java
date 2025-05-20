package com.logicalStrings;

public class CountCharString {
	
	public static int CountChar(String str) {
		
		int len=str.length();
		System.out.println(len);
		int count=0;
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				count=count+1;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str="ramana reddy yaramala";
	int res=	CountChar(str);
		System.out.println(res);
	}

}
