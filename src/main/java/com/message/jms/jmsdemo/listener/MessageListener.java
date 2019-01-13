package com.message.jms.jmsdemo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class MessageListener {

    @JmsListener(destination = "my_queue" ,containerFactory = "factory")
    public void processMessage(TextMessage message) throws JMSException {
        System.out.println("Processing data from Queue " + message.getText());
    }
}
