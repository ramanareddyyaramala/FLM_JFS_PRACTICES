package com.ram.Inheritance;

public class tests {

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
		
		
		parentp t=new childc();
		t.land();
		t.vehicle();
		
		
	}

}
