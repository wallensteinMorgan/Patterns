package org.example.adapter;

public class StripeAdapter implements PaymentProcessor{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }
    @Override
    public void pay(double amount) {
        stripe.chargePayment(amount);
    }
}
