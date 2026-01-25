package com.tp.P2;

import org.springframework.stereotype.Component;

public class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}