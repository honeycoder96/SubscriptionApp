package com.honey.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honey.backend.service.EmailService;
import com.honey.web.domain.frontend.FeedBackPojo;

@Controller
public class ContactController {

	/** The key which identifies the feedback pay load in the Model. */
	public static final String FEEDBACK_MODEL_KEY = "feedback";

	/** The Contact Us view name. */
	private static final String CONTACT_US_VIEW_NAME = "contact/contact";

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactGet(ModelMap model) {
		FeedBackPojo feedbackPojo = new FeedBackPojo();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
		return ContactController.CONTACT_US_VIEW_NAME;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedBackPojo feedback) {
		// LOG.debug("Feedback POJO content: {}", feedback);
		// System.out.println("FEEDBACK:" + feedback);
		emailService.sendFeedbackEmail(feedback);
		return ContactController.CONTACT_US_VIEW_NAME;
	}
}
