package org.example.adapter.payment;

public class PayPalAdapter implements PaymentGateway {
    private PayPalPaymentGateway payPalService;

    public PayPalAdapter(PayPalPaymentGateway payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(double amount) {
        // Adapting our method call to PayPal's specific API
        payPalService.makePayment(amount);
    }
}

