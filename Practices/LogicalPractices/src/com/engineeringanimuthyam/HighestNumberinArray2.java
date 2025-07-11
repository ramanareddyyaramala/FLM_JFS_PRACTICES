package com.engineeringanimuthyam;

public class HighestNumberinArray2 {
	
	public int highestElement(int[] num ) {
		
		int len=num.length;
		int high=num[0];
		
		for(int i=0;i<len;i++) {
			
			
			
				high=Math.max(num[i], high);
				
			
			
			
		}
		
		return high;
	}
	
	public static void main(String[] args) {
		
		int num[]= {12,43,53,11,88,1};
		HighestNumberinArray2 a=new HighestNumberinArray2();
	int res=	a.highestElement(num);
	System.out.println(res);
}
}
