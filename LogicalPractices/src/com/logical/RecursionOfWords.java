package com.logical;

public class RecursionOfWords {
	
	public void recWords(int n) {
		
		if(n>0) {
			System.out.print("GFG ");
			recWords(n-1);
		}
	}
		
	public static void main(String[] args) {
		int n=5;
	RecursionOfWords res=	new RecursionOfWords();
				res.recWords(n);
	}
}
