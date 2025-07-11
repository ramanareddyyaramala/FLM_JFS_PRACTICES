package com.ram.Inheritance;

public class Child1 extends Parent1 {
	int sal=45000;
	int emi=25000;
void sal() {
	System.out.println(sal);
}
void emi() {
	System.out.println(emi);
}
public static void main(String[] args) {
	Child1 a=new Child1();
	a.sal();
	a.emi();
	System.out.println(a.land);
	System.out.println(a.houses);
}
}
