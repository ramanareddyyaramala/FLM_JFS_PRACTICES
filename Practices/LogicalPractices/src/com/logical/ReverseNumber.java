package com.logical;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=121;
		int temp=n;//This has to store for the comparision purpose only
		int remainder=0;
		int reverse = 0;
		
		while(n!=0) {
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
			System.out.println();
		}
		if(reverse==temp) {
		System.out.println(reverse);
		}
		else {
		System.out.println("not "+temp);
		}
		
	}
}
