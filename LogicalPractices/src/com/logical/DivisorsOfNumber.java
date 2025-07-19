package com.logical;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber {
	
	public static List<Integer> NumberDivisor(int n) { 
		List<Integer> li=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				li.add(i);
			}
		}
		
		return li;
	}
	
	public static void main(String[] args) {
		int n=36;
		List<Integer>  divisors=NumberDivisor(n);
		System.out.println(divisors);
	}

}
