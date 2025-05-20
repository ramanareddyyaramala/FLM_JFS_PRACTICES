package com.logical.optimal;

import java.util.logging.Logger;

public class NumberOfDigits {
	
	public static int CountDigits(int n) {
		
		
		int	 cnt=(int)Math.log10(n)+1;
		return cnt;
	}
	
	public static void main(String[] args) {
		int n=1234;
	int res=CountDigits(n);
	System.out.println(res);
	}

}
