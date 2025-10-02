package com.suusarent.suusarentback;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE_USER("A"),
    DELETED_USER("D"),
    PENDING_RENTAL("Ostukorv"),
    UNCONFIRMED_RENTAL("Kinnitamata"),
    CONFIRMED_RENTAL("Kinnitatud"),
    ACTIVE_RENTAL("Aktiivne"),
    FINISHED("Lõpetatud"),
    ACTIVE_ITEM("Aktiivne"),
    ARCHIVED_ITEM("Arhiveeritud");


    private final String code;

    Status(String code) {
        this.code = code;
    }

}
