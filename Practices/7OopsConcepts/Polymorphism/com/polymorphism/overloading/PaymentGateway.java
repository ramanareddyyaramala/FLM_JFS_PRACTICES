package com.polymorphism.overloading;
	
	public class PaymentGateway {

	    // Pay using Credit Card
	    public void pay(String cardNumber, String name, String expiry, int cvv, double amount) {
	        System.out.println("Processing Credit Card payment...");
	        System.out.println("Paid ₹" + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
	    }

	    // Pay using Debit Card
	    public void pay(String cardNumber, String name, int pin, double amount) {
	        System.out.println("Processing Debit Card payment...");
	        System.out.println("Paid ₹" + amount + " using Debit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
	    }

	    // Pay using UPI
	    public void pay(String upiId, double amount) {
	        System.out.println("Processing UPI payment...");
	        System.out.println("Paid ₹" + amount + " using UPI ID " + upiId);
	    }

	    // Pay using Wallet
	    public void pay(double amount) {
	        System.out.println("Processing Wallet payment...");
	        System.out.println("Paid ₹" + amount + " using Wallet balance");
	    }
	    
	    public static void main(String[] args) {
			PaymentGateway payment1=new PaymentGateway();
			payment1.pay("6098509987877656","YARAMALA RAMANAREDDY",517,2500);
		}
	}



