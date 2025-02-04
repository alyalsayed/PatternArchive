package org.example.adapter.payment;

public class StripeAdapter implements PaymentGateway {
    private StripePaymentGateway stripeService;

    public StripeAdapter(StripePaymentGateway stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(double amount) {
        // Adapting our method call to Stripe's specific API
        stripeService.charge(amount);
    }
}
