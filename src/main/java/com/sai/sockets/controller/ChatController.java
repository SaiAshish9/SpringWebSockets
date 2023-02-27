package com.sai.sockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greet(String message) throws InterruptedException {
        Thread.sleep(2000);
        return "Hello, " + message;
    }

}