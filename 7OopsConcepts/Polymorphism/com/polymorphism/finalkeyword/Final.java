package com.polymorphism.finalkeyword;

public final class Final extends Final2{
		
	int a;//instace variable default value is of int 0;
	final int  b=20;
	public static void main(String[] args) {
		Final f=new Final();
		
		Final2 f2=new Final();
		System.out.println(f2.c=77);
		f.a=30;
		System.out.println(f.a=88);
	//	f.b=50; It won't change the value of b because it is declared with the "final" keyword
		System.out.println(f.b);
	}
}


//If we make the class as final that can't be inherit

//If we make the method as final that can't Override 