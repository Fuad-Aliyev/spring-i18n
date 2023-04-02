package com.fuadaliyev.i18n.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
//By default, a Spring Boot application will look for message files containing internationalization keys and values in the src/main/resources folder.
//Typically, the files for each locale will be named messages_XX.properties, where XX is the locale code.
//We can also define a fallback file messages.properties.
//However, the fallback file should not be considered related to the default locale. They are two separate concepts.
//The default locale is the locale to default to when the requested locale is unavailable, or null.
//On the other hand, the fallback file is a place to look up properties when the locale translation fails.
//If a key does not exist in a specific locale file, then the application will simply fall back to the fallback file.
public class LocaleConfiguration implements WebMvcConfigurer {
    //In order for our application to be able to determine which locale is currently in use, we need to add a LocaleResolver bean
    //The LocaleResolver interface has implementations that determine the current locale based on the session, cookies, the Accept-Language header, or a fixed value.
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    //Next, we need to add an interceptor bean that will switch to a new locale based on the value of the lang parameter when present on the request
    //In order for this bean to take effect, we need to add it to the application's interceptor registry.
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }
}
