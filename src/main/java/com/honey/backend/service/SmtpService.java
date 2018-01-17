package com.honey.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SmtpService extends AbstractEmailService {

	@Autowired
	private MailSender mailSender;

	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		System.out.println("Sending email");
		mailSender.send(message);
		System.out.println("Mail send!");
	}

}
