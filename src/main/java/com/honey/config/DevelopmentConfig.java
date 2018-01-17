package com.honey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.honey.backend.service.EmailService;
import com.honey.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file://${user.home}/.Subscriptionapp/application-dev.properties")
public class DevelopmentConfig {

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
