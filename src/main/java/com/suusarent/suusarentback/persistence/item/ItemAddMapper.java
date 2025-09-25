package com.suusarent.suusarentback.persistence.item;

import com.suusarent.suusarentback.controller.item.dto.ItemAddDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemAddMapper {
    @Mapping(source = "equipmentSizeId", target = "equipmentSize.id")
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "notes", target = "notes")
    Item toItem(ItemAddDto itemAddDto);


    // lugemisel
//    @InheritInverseConfiguration(name = "toEntity")
//    ItemAddDto toDto(Item item);
}