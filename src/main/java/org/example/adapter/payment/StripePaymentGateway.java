package org.example.adapter.payment;

public class StripePaymentGateway {
    public void charge(double amount) {
        System.out.println("Charged $" + amount + " using Stripe.");
    }
}
