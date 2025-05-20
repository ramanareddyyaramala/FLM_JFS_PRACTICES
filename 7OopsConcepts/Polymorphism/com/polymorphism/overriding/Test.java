package com.polymorphism.overriding;

public class Test {
	public static void main(String[] args) {
		BankAccount account=new SavingsAccount(50000, 2);
		account.calculateInterest();
	}
}
