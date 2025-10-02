package com.suusarent.suusarentback.controller.orderitem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemInfo {
    private Integer orderItemId;
    private String categoryName;
    private String equipmentSize;
    private BigDecimal price;
}
