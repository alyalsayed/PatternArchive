package org.example.adapter.payment;

public class Main {
    public static void main(String[] args) {
        // Using PayPal through the adapter
        PaymentGateway paypalGateway = new PayPalAdapter(new PayPalPaymentGateway());

        // Using Stripe through the adapter
        PaymentGateway stripeGateway = new StripeAdapter(new StripePaymentGateway());

        double amount = 100.0;

        // Processing payments
        paypalGateway.processPayment(amount);  // Output: Paid $100.0 via PayPal.
        stripeGateway.processPayment(amount);  // Output: Charged $100.0 using Stripe.
    }
}
