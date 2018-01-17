package com.honey.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.honey.web.domain.frontend.FeedBackPojo;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.address}")
	private String defaultToAddress;

	/**
	 * Creates a Simple Mail Message from a Feedback Pojo.
	 * 
	 * @param feedback
	 *            The Feedback pojo
	 * @return
	 */
	protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedBackPojo feedback) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(defaultToAddress);
		message.setFrom(feedback.getEmail());
		message.setSubject("[DevOps Buddy]: Feedback received from " + feedback.getFirstname() + " "
				+ feedback.getLastname() + "!");
		message.setText(feedback.getFeedback());
		return message;
	}

	@Override
	public void sendFeedbackEmail(FeedBackPojo feedbackPojo) {
		sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPojo));
	}
}
