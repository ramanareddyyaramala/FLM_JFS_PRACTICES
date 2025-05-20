package com.logical.optimal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hcfandlcm {
	
	public static int[] gcd(int a,int b) {
		int gcd=0;
		int lcm=0;
		final int num1=a;
		final int num2=b;
		while(a>0 && b>0) {
			
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
					}
		if(a==0) {
			gcd= b;
		}
		else {
			gcd= a;
		}
		lcm=(num1*num2)/gcd;
		int arr[]= {lcm,gcd};
		return arr;
	}
	
	
	public static void main(String[] args) {
		int a=20,b=40;
		
	int res[]=gcd(a, b);
	
	System.out.println(Arrays.toString(res));
	
	
	}

}
