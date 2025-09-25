package com.suusarent.suusarentback.controller.category.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.suusarent.suusarentback.persistence.category.Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfo implements Serializable {
    private Integer categoryId;
    private String categoryName;
    private BigDecimal price;
}