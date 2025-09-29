package com.suusarent.suusarentback.controller.category.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ItemCategoryDropdown implements Serializable {
    private Integer id;
    private String name;
    private Integer sizeTypeId;
}

