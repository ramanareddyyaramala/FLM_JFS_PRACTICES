package com.interfaces;

public class Test {
		
	public static void main(String[] args) {
		
		Trai airtel=new Airtel();
		//Use only parent reference in interface No need of class own methods..
		airtel.calls();
		airtel.recharge();
		airtel.messages();
		airtel.internet();
		
		System.out.println();
		 
		Trai jio=new Jio();
		jio.calls();
		jio.messages();
		jio.recharge();
		jio.internet();
		
	}
	
}
