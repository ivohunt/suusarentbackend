package com.suusarent.suusarentback.controller.item.dto;

import com.suusarent.suusarentback.persistence.item.Item;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemAvailableDto {
    private Integer itemId;
    private String status;
    private String notes;
    private Integer equipmentSizeId;
    private String equipmentSizeName;

    public ItemAvailableDto(Item item) {
        this.itemId = item.getId();
        this.status = item.getStatus();
        this.notes = item.getNotes();
        if (item.getEquipmentSize() != null) {
            this.equipmentSizeId = item.getEquipmentSize().getId();
            this.equipmentSizeName = item.getEquipmentSize().getName();
        }
    }
}