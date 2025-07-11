package com.logicalStrings;

public class StringOcc {
	
	public static void occurrenceStringChar(String str) {
		int len=str.length();
		
		boolean[] counted=new boolean[len];
		for(int i=0;i<len;i++) {
			
			if(counted[i]) {
				continue;
			}
			
			char ch=str.charAt(i);
			
			
			
			int count=0;
			
			
			for(int j=0;j<len;j++) {
				char ch1=str.charAt(j);
				
				if(ch==ch1) {
					count=count+1;
					
					counted[j]=true;
					
			
				}
			}
			System.out.println(ch+"-----"+count);
		}
		
	}
			
		
	public static void main(String[] args) {
		String str="Ramanareddy";
		occurrenceStringChar(str);
	}
}
