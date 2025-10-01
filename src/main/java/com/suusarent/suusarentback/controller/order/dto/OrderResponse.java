package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class OrderResponse {
    private Integer orderId;
    private String orderNumber;
    private LocalDate start;
    private LocalDate end;
    private String status;
    private BigDecimal totalPrice;
    private Integer userId;
}