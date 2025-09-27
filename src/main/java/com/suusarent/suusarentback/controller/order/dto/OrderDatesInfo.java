package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class OrderDatesInfo {

        private LocalDate orderStart;
        private LocalDate orderEnd;
}
