package com.luna.activemq;

import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination="my-destination")
	public void receiveMessage(TextMessage message){
		System.out.println("<"+message+">");
	}
}
