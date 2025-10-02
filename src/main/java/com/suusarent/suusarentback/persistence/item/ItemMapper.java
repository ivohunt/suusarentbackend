package com.suusarent.suusarentback.persistence.item;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.time.Instant;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        imports = {Status.class, Instant.class})
public interface ItemMapper {

//    @Mapping(source = "categoryId", target = "category.id")
//    @Mapping(source = "notes", target = "notes")
//

    @Mapping(expression = "java(Status.ACTIVE_ITEM.getCode())", target = "status")
    @Mapping(source = "notes", target = "notes")
    @Mapping(expression = "java(Instant.now())", target = "createdAt")
    @Mapping(expression = "java(Instant.now())", target = "updatedAt")
    @Mapping(constant = "true", target = "isAvailable")
    Item toItem(ItemDto itemDto);

}