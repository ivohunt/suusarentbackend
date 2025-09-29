package com.suusarent.suusarentback.persistence.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEquipmentSizeDto implements Serializable {
    private Integer id;
    private Integer sizeTypeId;
    private String sizeTypeName;
}