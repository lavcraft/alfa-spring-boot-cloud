package ru.alfa.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EmailProperties.class)
public class AutoConfigurationStarter {

    @Bean
    @ConditionalOnProduction
    public DeprecatedAspect deprecatedAspect() {
        return new DeprecatedAspect();
    }

    @Bean
    @ConditionalOnProperty("alfastarter.emails")
    public EmailService emailService() {
        return new EmailService();
    }

}
