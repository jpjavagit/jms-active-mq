package com.message.jms.jmsdemo.controller;

import com.message.jms.jmsdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/active")
public class JmsController {

    @Autowired
    JmsTemplate jmsTemplate;

    static String QUEUE = "my_queue";

    @RequestMapping(
            value = "/send",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendJMS(@RequestBody Product product){
        jmsTemplate.convertAndSend(QUEUE,product);
    }
}
