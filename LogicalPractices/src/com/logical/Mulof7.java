package com.logical;

public class Mulof7 {

	public boolean getMulOf7(int m) {
		if(m%7==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		boolean m=new Mulof7().getMulOf7(56);
		System.out.println(m);
	}
	
}
