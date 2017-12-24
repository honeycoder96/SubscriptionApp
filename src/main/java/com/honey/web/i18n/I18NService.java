package com.honey.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class I18NService {

	@Autowired
	private MessageSource messagesource;
	
	

	/** 
	 * Return a message for the given message id and default locale in the session context
	 * **/
	public String getMessage(String messageId) {
		Locale locale=LocaleContextHolder.getLocale();
		
		return getMessage(messageId,locale);
	}
	

	/** 
	 * Return a message for the given message id and locale
	 * **/
	public String getMessage(String messageId,Locale locale) {

		return messagesource.getMessage(messageId, null, locale);
	}
}
