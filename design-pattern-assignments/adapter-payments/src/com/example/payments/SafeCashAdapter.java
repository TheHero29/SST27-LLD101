package com.example.payments;

import java.util.Objects;

public class SafeCashAdapter implements PaymentGateway{
    SafeCashClient client;
    SafeCashAdapter(SafeCashClient client) {
        this.client = client;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        try {
            Objects.requireNonNull(customerId, "customerId must not be null");
            if (customerId.isEmpty()) {
                throw new IllegalArgumentException("customerId must not be empty");
            }
            Objects.requireNonNull(amountCents, "amountCents must not be null");
            return client.createPayment(amountCents, customerId).confirm();
        } catch (Exception e) {
            System.err.println("Error occurred while charging: " + e.getMessage());
            return null;
        }
    }
    
}
