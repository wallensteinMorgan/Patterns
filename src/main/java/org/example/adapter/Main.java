package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.pay(100.0);

        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.pay(150.0);
    }
}
