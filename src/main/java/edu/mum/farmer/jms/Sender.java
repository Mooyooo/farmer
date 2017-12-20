package edu.mum.farmer.jms;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Queue queue;

	public void send(String msg) {
		System.out.println("sending msg to bank.queue ..."+ "\nmsg:"+msg);
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}
}