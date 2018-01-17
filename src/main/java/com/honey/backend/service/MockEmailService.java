package com.honey.backend.service;

import org.springframework.mail.SimpleMailMessage;

import com.honey.web.domain.frontend.FeedBackPojo;

public class MockEmailService extends AbstractEmailService {

	// private static final Logger LOG =
	// LoggerFactory.getLogger(MockEmailService.class);

	@Override
	public void sendFeedbackEmail(FeedBackPojo feedback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendGenericEmailMessage(SimpleMailMessage message) {
		// TODO Auto-generated method stub
		// LOG.debug("Simulating an email service...");
		// LOG.info(message.toString());
		// LOG.debug("Email sent.");
		System.out.println("Mail Send Succesfully!!");
	}

}
