package com.vinod.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vinod.ioc.EmailService;
import com.vinod.ioc.SMSService;

@Configuration
@ComponentScan("com.vinod")
public class AppConfig {

	@Bean(name = "annotationEmailService")
	EmailService emailService() {
		return new EmailService();
	}

	@Bean(name = "annotationSMSService")
	SMSService smsService() {
		return new SMSService();
	}

}
