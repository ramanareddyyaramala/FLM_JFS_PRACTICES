package com.task3;

public class RelationalUnaryOperations {
		public static void main(String[] args) {
			int a=10;
			int b=5;
			boolean abg=a>b;
			boolean abge=a>=b;
			boolean abl=a<b;
			boolean able=a<=b;
			boolean abne=a!=b;
			boolean abe=a==b;
			System.out.println("These are Relational Operations");
			System.out.println(abg);
			System.out.println(abge);
			System.out.println(abl);
			System.out.println(able);
			System.out.println(abne);
			System.out.println(abe);
			
			short c=23;
			short d=43;
			boolean booleanVariabel=false;
			System.out.println("These are the Unary Operations");
			System.out.println(-c);
			System.out.println(-d);
			
			System.out.println(+c);
			System.out.println(+d);
			System.out.println(c++);
			System.out.println(c);
			System.out.println(++c);
			System.out.println(c);
			
			System.out.println(c++ + d*++c);
			
			System.out.println(!booleanVariabel);
		}
}
