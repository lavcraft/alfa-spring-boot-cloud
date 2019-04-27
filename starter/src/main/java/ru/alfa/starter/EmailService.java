package ru.alfa.starter;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailService {
    @Autowired EmailProperties emailProperties;

    public void sendEmail() {
        emailProperties.getEmails().forEach(s -> System.out.println("notify — " + s));
    }
}
