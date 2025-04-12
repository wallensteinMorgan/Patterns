package org.example.adapter;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pay(double amount) {
        payPal.makePayment(amount);
    }
}