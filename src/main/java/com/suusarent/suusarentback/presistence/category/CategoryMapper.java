package com.suusarent.suusarentback.presistence.category;

import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.controller.category.dto.CategoryInfos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {


    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "sizeType", target = "sizeType")
    Category toCategoryDto(CategoryDto categoryDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    CategoryInfos toCategoryInfo(Category category);

    List<CategoryInfos> toCategoryInfos(List<Category> categories);

}
