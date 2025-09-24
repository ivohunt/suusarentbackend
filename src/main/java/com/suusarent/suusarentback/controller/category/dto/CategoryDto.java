package com.suusarent.suusarentback.controller.category.dto;

import com.suusarent.suusarentback.presistence.category.Category;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements Serializable {
    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    @Size(max = 10)
    private String sizeType;
}