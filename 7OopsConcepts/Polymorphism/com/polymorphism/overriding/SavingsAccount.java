package com.polymorphism.overriding;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double principal, int timeInYears) {
        super(principal, timeInYears);
    }

    @Override
    public void calculateInterest() {
        double interest = principal * 0.04 * timeInYears; // 4% interest
        System.out.println("Savings Account: 4% interest applied.");
        System.out.println("Interest: ₹" + interest);
    }
}

