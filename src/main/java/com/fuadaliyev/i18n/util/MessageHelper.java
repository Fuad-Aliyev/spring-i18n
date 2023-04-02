package com.fuadaliyev.i18n.util;

import java.util.Locale;

import static com.fuadaliyev.i18n.util.MessageConstants.*;

public interface MessageHelper {
    static Locale getLocaleByLanguage(String languageCode) {
        if (languageCode != null) {
            switch (languageCode) {
                case LANGUAGE_CODE_ENG:
                    return LOCALE_ENGLISH;
                case LANGUAGE_CODE_AZE:
                    return LOCALE_AZE;
            }
        }
        return DEFAULT_LOCALE;
    }
}
