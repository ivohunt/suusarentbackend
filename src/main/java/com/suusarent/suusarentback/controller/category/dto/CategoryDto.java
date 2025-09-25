package com.suusarent.suusarentback.controller.category.dto;

import com.suusarent.suusarentback.persistence.category.Category;
import jakarta.validation.constraints.Min;
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
    private String categoryName;

    @NotNull
    private BigDecimal price;

    @NotNull
    @Min(1)
    private Integer sizeTypeId;
}