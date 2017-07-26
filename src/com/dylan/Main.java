package com.dylan;
import java.time.LocalDateTime;
public class Main {

    public static void main(String[] args) {
	// write your code here
        TextNotification textOne = new TextNotification("Math", "E=MC^2", "Phil", "T-Mobile");
        EmailNotification emailOne = new EmailNotification("Food", "Great", "Dylan", "Google");


        textOne.transport();
        emailOne.transport();
        textOne.showStatus();
        emailOne.showStatus();
        EmailNotification clonedEmail = emailOne;

        clonedEmail.transport();
     }

}
