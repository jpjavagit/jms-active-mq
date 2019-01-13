package com.message.jms.jmsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class JmsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsdemoApplication.class, args);
	}

}

