package com.suusarent.suusarentback;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE_USER("A"),
    DELETED_USER("D"),
    UNCONFIRMED_RENTAL("UNC_RENT"),
    CONFIRMED_RENTAL("CONF_RENT"),
    ACTIVE_RENTAL("ACT_RENT"),
    FINISHED("FIN_RENT"),
    ACTIVE_ITEM("ACT_ITEM"),
    ARCHIVED_ITEM("ARC_ITEM");


    private final String code;

    Status(String code) {
        this.code = code;
    }

}
