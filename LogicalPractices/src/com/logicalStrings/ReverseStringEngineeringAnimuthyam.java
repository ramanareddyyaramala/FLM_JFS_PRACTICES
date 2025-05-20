package com.logicalStrings;

public class ReverseStringEngineeringAnimuthyam {
	
	public boolean palindromeOrnot(String str) {
		
		int len=str.length();
		
		String pal="";
		
		for(int i=len-1;i>=0;i--) {
			pal=pal+str.charAt(i);
			
		}
		if(str.equals(pal)) {
			
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		
		String str="madams";
		
	ReverseStringEngineeringAnimuthyam	s=new ReverseStringEngineeringAnimuthyam();
		boolean check=s.palindromeOrnot(str);
		System.out.println(check);
		
	}
}
