package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private String userId;

    public WhatsAppDecorator(Notifier notifier, String userId) {
        super(notifier);
        this.userId = userId;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendWhatsapp(message);
    }

    private void sendWhatsapp(String message) {
        System.out.println("Sending WhatsApp message to " + userId + ": " + message);
    }
    
}
