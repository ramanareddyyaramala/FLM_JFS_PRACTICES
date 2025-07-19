package com.logical;

import java.util.ArrayList;

public class FactorialsLessthanorEqualton {
	
	public static ArrayList<Integer> getFact(int n){
		
	ArrayList<Integer> li=	new ArrayList<>();
		int i=1;
		int fact=1;
		while(fact<=n) {
			
			li.add(fact);
			i++;
			fact=fact*i;
			
			
		}
		return li;
	}

	public static void main(String[] args) {
		
		int n=3;
		ArrayList<Integer>	al=getFact(n);
		System.out.println(al);
	

	}

}
