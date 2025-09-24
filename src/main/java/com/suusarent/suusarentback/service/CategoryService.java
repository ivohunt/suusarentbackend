package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Error;
import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.presistence.category.Category;
import com.suusarent.suusarentback.presistence.category.CategoryMapper;
import com.suusarent.suusarentback.presistence.category.CategoryRepository;
import com.suusarent.suusarentback.presistence.size.Size;
import com.suusarent.suusarentback.presistence.size.SizeMapper;
import com.suusarent.suusarentback.presistence.size.SizeRepository;
import com.suusarent.suusarentback.presistence.size.SizeTypeInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    private final SizeRepository sizeRepository;
    private final SizeMapper sizeMapper;

    public void addCategory(CategoryDto categoryDto) {
        if (categoryRepository.existsByName(categoryDto.getName())) {
            throw new ForbiddenException(Error.CATEGORY_ALREADY_EXISTS.getMessage(), Error.CATEGORY_ALREADY_EXISTS.getErrorCode());
        }
        Category category = categoryMapper.toCategoryDto(categoryDto);
        categoryRepository.save(category);

    }

    public List<SizeTypeInfo> findSizeTypes() {
        List<Size> sizes = sizeRepository.findAll();
        return sizeMapper.toSizeTypeInfos(sizes);
    }
}
