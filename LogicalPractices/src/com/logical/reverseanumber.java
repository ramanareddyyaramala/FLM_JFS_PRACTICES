package com.logical;

public class reverseanumber {
	
	
	public static int getReversedNumber(int n) {
		int reversed=0;
		
		while(n!=0) {
			
			int digit=n%10;
			
			if(reversed >Integer.MAX_VALUE/10 || reversed==Integer.MAX_VALUE && digit>7) {
				return 0;
			}
			else if(reversed <Integer.MIN_VALUE ||reversed ==Integer.MIN_VALUE && digit<-8) {
				return 0;
			}
			reversed=reversed*10+digit;
			n=n/10;
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		int num=-1234;
		int res=getReversedNumber(num);
		System.out.println(res);
	}

}
