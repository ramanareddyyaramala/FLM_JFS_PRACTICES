package com.logical;

public class ArmstrongNumber {
		public  static boolean ArmNum(int n) {
			int sum=0;
			final int org=n;
			while(n>0) {
				double ld=n%10;
				double q=Math.pow(ld, 3.0);
				sum=(int) (sum+q);
				n=n/10;
			}
			if(sum==org) {
				return true;
			}
			else {
				return false;
			}
			
		}
	
	public static void main(String[] args) {
		int n=153;
		boolean arm=ArmNum(n);
		System.out.println(arm);
		
	}
}
