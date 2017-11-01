package com.luna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SpringBootActivemqApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActivemqApplication.class, args);
	}
	@Autowired
	JmsTemplate jmsTemplate;

	
}
