package com.suusarent.suusarentback;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE_USER("A"),
    DELETED_USER("D"),
    PENDING_RENTAL("Kasutaja kinnitatud"),
    UNCONFIRMED_RENTAL("Kasutaja kinnitatud"),
    CONFIRMED_RENTAL("Admini kinnitatud"),
    ACTIVE_RENTAL("Aktiivne"),
    FINISHED("Lõpetatud"),
    ACTIVE_ITEM("Aktiivne"),
    ARCHIVED_ITEM("Arhiveeritud");


    private final String code;

    Status(String code) {
        this.code = code;
    }

}
