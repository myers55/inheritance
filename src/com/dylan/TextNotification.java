package com.dylan;

public class TextNotification extends Notification{
    private String recipient;
    private String smsProvider;
    protected String status;

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public String getStatus() {return status;}

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        notifyUser();
    }





    @Override
    public void transport() {
        System.out.println(getBody());
        System.out.println(getCreatedAt());
        System.out.println(getSubject());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());

    }
}
