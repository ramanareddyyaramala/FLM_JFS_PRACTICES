package com.ram.Inheritance;

public class Test {

	public static void main(String[] args) {
		//child assestts
		Child a=new Child();
		System.out.println(a.homeemi);
		System.out.println(a.sal);
		System.out.println(a.cash);
		System.out.println(a.housetype);
		//Parent assets
		Parent b=new Parent();
		System.out.println("Parent properties");
		System.out.println(b.cash);
		System.out.println(b.housetype);
		System.out.println(b);

	}

}
