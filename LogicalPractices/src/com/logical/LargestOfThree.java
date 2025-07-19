package com.logical;



public class LargestOfThree {

	public int getLarge(int n1,int n2, int n3) {
		
		int n=n1>n2 && n1>n3 ? n1:n2>n1 && n2>n3 ?n2 :n3;
		
		return n;//using of the ternary operator..
	}
	
	public static void main(String[] args) {
		LargestOfThree l=new LargestOfThree();
		int a=l.getLarge(28, 76, 43);
		
		System.out.println(a);
	}
}
