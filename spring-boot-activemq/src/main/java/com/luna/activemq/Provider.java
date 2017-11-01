package com.luna.activemq;

import org.apache.activemq.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Provider {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Scheduled(fixedRate=5000)
	public void sendMessage(){
		jmsTemplate.send("my-destination",new MSG());
	}
}
