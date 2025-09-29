package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderDatesInfo {

    private LocalDate orderStart;
    private LocalDate orderEnd;
}
