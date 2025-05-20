package com.logical;

public class Hcf {
	
	public static int findHcf(int a,int b) {
		int gcd=0;
		for(int i=1;i<Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
				gcd= i;
			}
		}
			
		return gcd;
	}
	
	public static void main(String[] args) {
		int a=111,b=121;
		
		int gcd=	findHcf(a, b);	
		System.out.println(gcd);
	}

}
