package com.suusarent.suusarentback;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE_USER("A"),
    DELETED("D"),
    UNCONFIRMED("UNC"),
    CONFIRMED("CON"),
    ACTIVE_RENTAL("ACT"),
    FINISHED("FIN"),
    ;

    private final String code;

    Status(String code) {
        this.code = code;
    }

    }
