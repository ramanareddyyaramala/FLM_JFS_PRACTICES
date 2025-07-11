package com.ram.Inheritance;

public class childc extends parentp{
	void loan() {
		System.out.println("home loan");
	}
	void bankd() {
		System.out.println("100000 depo");
	}
	void vehicle() {
		System.out.println("car");
	}
	
	public static void main(String[] args) {
		childc c=new childc();
		c.loan();
		c.bankd();
		c.vehicle();
		
		System.out.println("-------------");
		
		parentp p=new parentp();
		p.land();
		p.vehicle();
		
		System.out.println("-------------");
		
		parentp r=new childc();
		r.land();
		r.vehicle();
	}

}

