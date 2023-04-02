package com.fuadaliyev.i18n.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static com.fuadaliyev.i18n.util.MessageConstants.*;
import static java.nio.charset.StandardCharsets.UTF_8;

@Configuration
public class MessageSourceConfiguration implements WebMvcConfigurer {

    @Bean(LABELS_MESSAGES_BEAN_NAME)
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename(LABELS_PATH);
        messageSource.setDefaultEncoding(UTF_8.name());
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setDefaultLocale(DEFAULT_LOCALE);
        return messageSource;
    }
}
