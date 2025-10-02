package com.suusarent.suusarentback.controller.item.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {

    @NotNull
    @Min(1)
    private Integer categoryId;

    @Size(max = 500)
    private String notes;

    @NotNull
    @Min(1)
    private Integer equipmentSizeId;

    private String itemImageData;
}