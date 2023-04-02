package com.fuadaliyev.i18n.util;

import java.util.Locale;

public final class MessageConstants {
    private MessageConstants() {}
    public static final String LABELS_MESSAGES_BEAN_NAME = "labels-msg";
    public static final String LABELS_PATH = "classpath:i18n/labels";
    public static final String LANGUAGE_CODE_ENG = "eng";
    public static final String LANGUAGE_CODE_AZE = "aze";
    public static final Locale LOCALE_ENGLISH = new Locale(LANGUAGE_CODE_ENG);
    public static final Locale LOCALE_AZE = new Locale(LANGUAGE_CODE_AZE);
    public static final Locale DEFAULT_LOCALE = LOCALE_ENGLISH;
    public static final String LABELS_COST = "labels.cost";
}
