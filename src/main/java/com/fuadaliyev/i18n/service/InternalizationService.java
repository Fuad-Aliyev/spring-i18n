package com.fuadaliyev.i18n.service;

import com.fuadaliyev.i18n.util.MessageHelper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import static com.fuadaliyev.i18n.util.MessageConstants.LABELS_MESSAGES_BEAN_NAME;

@Service
public class InternalizationService {
    private final MessageSource messageSource;

    public InternalizationService(@Qualifier(LABELS_MESSAGES_BEAN_NAME) MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String testMessage(String labelCode, String languageCode) {
        return messageSource.getMessage(labelCode, null, MessageHelper.getLocaleByLanguage(languageCode));
    }
}
