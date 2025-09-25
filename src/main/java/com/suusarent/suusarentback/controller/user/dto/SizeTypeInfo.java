package com.suusarent.suusarentback.controller.user.dto;

import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link EquipmentSize}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeTypeInfo implements Serializable {
    private Integer sizeTypeId;
    private String sizeTypeName;
}