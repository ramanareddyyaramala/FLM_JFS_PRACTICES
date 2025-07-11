package com.engineeringanimuthyam;

public class HighestNumberinArray {
	
	public int highestElement(int[] num ) {
		
		int len=num.length;
		int high=num[0];
		
		for(int i=0;i<len;i++) {
			
			
			if(high<=num[i]) {
				high=num[i];
			}
			
			
		}
		
		return high;
	}
	
	public static void main(String[] args) {
		
		int num[]= {12,43,53,11,88};
		HighestNumberinArray a=new HighestNumberinArray();
	int res=	a.highestElement(num);
	System.out.println(res);
}
}
