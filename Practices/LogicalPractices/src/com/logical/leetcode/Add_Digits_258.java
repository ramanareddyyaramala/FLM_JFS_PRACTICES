package com.logical.leetcode;

public class Add_Digits_258 {
	
	public static int SumOfDigits(int num) {
		
		int sum=0;
		for(int i=0;i<num;i++) {
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
		}
		
		
		
		
		
		return sum;
	}

	public static void main(String[] args) {
		int num=38;
		
		int res=SumOfDigits(num);
		System.out.println(res);
	}

}
