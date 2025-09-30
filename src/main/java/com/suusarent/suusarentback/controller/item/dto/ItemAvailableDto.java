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

    public ItemAvailableDto(Item itemId) {
        this.itemId = itemId.getId();
        this.status = itemId.getStatus();
        this.notes = itemId.getNotes();
        this.equipmentSizeId = itemId.getEquipmentSize().getId();
    }

}