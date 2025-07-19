package com.logical;

public class LastDigitOfNum {
	
	public void getLastD(int n) {
		
		String s=String.valueOf(n);
		char lastC= s.charAt(s.length()-1);//index value of of last digit 
		System.out.println(lastC);
		
		
	}

	public static void main(String[] args) {
		LastDigitOfNum n=new LastDigitOfNum();
		n.getLastD(1234);
	
			
	}

}
