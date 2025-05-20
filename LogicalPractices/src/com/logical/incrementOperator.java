package com.logical;

public class incrementOperator {

	public static void main(String[] args) {
		
		int x=15;
		int y=x++;
		int z=++x;
		int result=x;
		System.out.println(y+"------"+z);//y=15 ,17
		
		System.out.println(result);
	}

}
