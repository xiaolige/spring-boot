package com.luna.activemq;



import java.time.LocalDateTime;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;

public class MSG implements MessageCreator{

	@Override
	public Message createMessage(Session session) throws JMSException {
		return session.createTextMessage(LocalDateTime.now()+":hello,girl! hanyun");
	}

	

}
