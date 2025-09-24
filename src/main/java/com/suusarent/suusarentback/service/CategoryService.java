package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Error;
import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.presistence.category.Category;
import com.suusarent.suusarentback.presistence.category.CategoryMapper;
import com.suusarent.suusarentback.presistence.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public void addCategory(CategoryDto categoryDto) {
        if (categoryRepository.existsByName(categoryDto.getName())) {
            throw new ForbiddenException(Error.CATEGORY_ALREADY_EXISTS.getMessage(), Error.CATEGORY_ALREADY_EXISTS.getErrorCode());
        }
        Category category = categoryMapper.toCategoryDto(categoryDto);
        categoryRepository.save(category);

    }
}
