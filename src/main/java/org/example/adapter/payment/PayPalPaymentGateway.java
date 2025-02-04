package org.example.adapter.payment;

public class PayPalPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}

