package com.honey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.honey.backend.service.EmailService;
import com.honey.backend.service.SmtpService;

@Configuration
@Profile("prod")
@PropertySource("file://${user.home}/.Subscriptionapp/application-prod.properties")
public class ProductionConfiguration {

	@Bean
	public EmailService emailService() {
		return new SmtpService();
	}
}
