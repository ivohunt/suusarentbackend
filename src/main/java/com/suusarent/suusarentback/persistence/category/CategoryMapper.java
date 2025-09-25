package com.suusarent.suusarentback.persistence.category;

import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.controller.category.dto.CategoryInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {


    @Mapping(source = "categoryName", target = "name")
    @Mapping(source = "price", target = "price")
    Category toCategoryDto(CategoryDto categoryDto);

    @Mapping(source = "id", target = "categoryId")
    @Mapping(source = "name", target = "categoryName")
    @Mapping(source = "price", target = "price")
    CategoryInfo toCategoryInfo(Category category);

    List<CategoryInfo> toCategoryInfos(List<Category> categories);

}
