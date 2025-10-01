package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemRequestDto {
    private Integer orderId;
    private Integer itemId;
    private BigDecimal price;
}