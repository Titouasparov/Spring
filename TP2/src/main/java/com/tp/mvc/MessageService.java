package com.tp.mvc;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String process(String msg) {
        return msg.toUpperCase();
    }
}
