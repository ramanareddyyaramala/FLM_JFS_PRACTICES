package com.logical;

public  class RecursionNtimes {
	int count=1;
	public void recursionFunc(int n) {
		
		if(n>=1) {
			System.out.println(count++);
			recursionFunc(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		int n=10;
	RecursionNtimes rec=new 	RecursionNtimes();
		rec.recursionFunc(n);
		
	}
}
