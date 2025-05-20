package com.logical;

public class FibanacciSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next;
		int n=7;
		System.out.println(first);
		for(int i=1;i<=n;i++) {
			next=first+second;
			first=second;
			second=next;
			
			System.out.println(second);
		}

	}

}
