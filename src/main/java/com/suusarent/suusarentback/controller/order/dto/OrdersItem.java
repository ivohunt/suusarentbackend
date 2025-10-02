package com.suusarent.suusarentback.controller.order.dto;

import lombok.Data;

@Data
public class OrdersItem {
    private Integer itemId;
    private Integer categoryId;
    private Integer equipmentSizeId;
}