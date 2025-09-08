package com.example.notifications;

public class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void notify(String message) {
        wrappee.notify(message);
    }
    
}
