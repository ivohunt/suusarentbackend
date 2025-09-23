package com.suusarent.suusarentback.presistence.category;

import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {


    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    Category toCategoryDto(CategoryDto categoryDto);
}