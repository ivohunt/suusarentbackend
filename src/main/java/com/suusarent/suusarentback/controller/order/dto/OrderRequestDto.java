package com.suusarent.suusarentback.controller.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderRequestDto {
    private String start;
    private String end;
    private Integer userId;
}