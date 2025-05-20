package com.logical;

public class returnminus1 {
	
	public int division(int numerator,int denominator) {
		if(denominator==0) {
			return -1;
		}
		return numerator/denominator;
	}

	public static void main(String[] args) {
	
		returnminus1 a=new returnminus1();
		int d=a.division(2, 0);
		System.out.println(d);
	}

}
