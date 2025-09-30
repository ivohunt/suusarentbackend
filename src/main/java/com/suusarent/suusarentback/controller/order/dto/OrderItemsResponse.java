package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class OrderItemsResponse {
    private Integer orderItemId;
    private Integer orderId;
    private Integer itemId;
    private BigDecimal price;
    private Instant timestamps;
}