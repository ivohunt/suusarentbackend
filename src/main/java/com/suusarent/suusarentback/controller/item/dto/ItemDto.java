package com.suusarent.suusarentback.controller.item.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.suusarent.suusarentback.persistence.item.Item}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {
    private Integer categoryId;
    @Size(max = 500)
    private String notes;
    private Integer equipmentSizeId;
    private String itemImageData;
}