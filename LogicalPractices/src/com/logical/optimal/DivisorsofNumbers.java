package com.logical.optimal;

import java.util.ArrayList;
import java.util.List;

public class DivisorsofNumbers {
	
	public static List<Integer> divisorsNumber(int n){
		List<Integer> li=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				li.add(i);
				System.out.println("first if "+i);
				if(n/i !=i) {
					li.add(n/i);
					System.out.println("second if "+n/i);
				}
			}
			
		}
		return li;
	}
	
	
		public static void main(String[] args) {
			int n=36;
		List<Integer> li=	divisorsNumber(n);
		System.out.println(li);
		}
}
