package com.suusarent.suusarentback.controller.category.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.suusarent.suusarentback.presistence.category.Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfos implements Serializable {
    private Integer id;
    @NotNull
    @Size(max = 255)
    private String name;
    @NotNull
    private BigDecimal price;
}