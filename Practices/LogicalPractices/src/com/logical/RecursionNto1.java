package com.logical;

public class RecursionNto1 {
		
		public void recNto1(int n) {
			
			
			if(n<1) {
				return ;
			}
				System.out.print(n+" ");
				recNto1(n-1);
			}
		
		
		public static void main(String[] args) {
		int n=10;
			RecursionNto1 rec=	new RecursionNto1();
		rec.recNto1(n);
		}
}
