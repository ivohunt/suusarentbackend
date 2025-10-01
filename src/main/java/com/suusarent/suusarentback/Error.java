package com.suusarent.suusarentback;

import lombok.Getter;

@Getter
public enum Error {
    INCORRECT_CREDENTIALS("Vale kasutajanimi või parool", 111),
    EMAIL_ALREADY_EXISTS("Sellise emailiga kasutaja on juba süsteemis olemas", 333),
    CATEGORY_ALREADY_EXISTS("Sellise nimega kategooria on juba süsteemis olemas", 222);


    private final String message;
    private final int errorCode;

    Error(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

}
