package com.dylan;

import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
        this.status = "Hello There!";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }
    public String getBody() {
        return body;
    }
    protected void notifyUser(){
        System.out.println("Goodbye!");
    }
    protected String showStatus(){
        System.out.println(status);
        return status;
    }
    public void transport(){
        throw new NoTransportException();
    }
}
