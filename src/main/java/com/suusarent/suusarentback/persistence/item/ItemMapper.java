package com.suusarent.suusarentback.persistence.item;

import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemMapper {

    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "notes", target = "notes")
    Item toItem(ItemDto itemDto);


    // lugemisel
//    @InheritInverseConfiguration(name = "toEntity")
//    ItemDto toDto(Item item);
}