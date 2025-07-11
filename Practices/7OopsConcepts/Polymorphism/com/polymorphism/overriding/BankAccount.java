package com.polymorphism.overriding;

public class BankAccount {
    protected double principal;
    protected int timeInYears;

    public BankAccount(double principal, int timeInYears) {
        this.principal = principal;
        this.timeInYears = timeInYears;
    }

    public void calculateInterest() {
        double interest = principal * 0.03 * timeInYears; // 3% default
        System.out.println("Bank Account: 3% interest applied.");
        System.out.println("Interest: ₹" + interest);
    }
}
