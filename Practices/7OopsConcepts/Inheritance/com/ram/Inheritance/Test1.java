package com.ram.Inheritance;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Assets aquired to child from the parent and Grand Parent");
	Child1 a=new Child1();
	System.out.println(a.sal);
	System.out.println(a.emi);
	System.out.println(a.land);
	System.out.println(a.houses);
	System.out.println(a.cash);
	System.out.println(a.coins);
	System.out.println("Assets aquired to Parent from the Grand Parent");
	Parent1 r=new Parent1();
	System.out.println(r.cash);
	System.out.println(r.coins);
	System.out.println(r.land);
	System.out.println(r.houses);
	System.out.println("Assets having  Grand Parent and he won't get anything from anyone");
	Gparent m=new Gparent();
	System.out.println(m.cash);
	System.out.println(m.coins);
	
	

	}
}
