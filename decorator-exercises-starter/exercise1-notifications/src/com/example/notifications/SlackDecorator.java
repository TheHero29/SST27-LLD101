package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending Slack message to " + channel + ": " + message);
    }

}
