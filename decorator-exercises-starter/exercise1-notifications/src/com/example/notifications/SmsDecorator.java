package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private String phoneNumber;
    public SmsDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendSms(message);
    }

    private void sendSms(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
    
}
