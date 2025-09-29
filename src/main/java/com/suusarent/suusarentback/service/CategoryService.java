package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Error;
import com.suusarent.suusarentback.controller.category.dto.CategoryDto;
import com.suusarent.suusarentback.controller.category.dto.CategoryInfo;
import com.suusarent.suusarentback.infrastructure.exception.ForbiddenException;
import com.suusarent.suusarentback.infrastructure.exception.PrimaryKeyNotFoundException;
import com.suusarent.suusarentback.persistence.category.Category;
import com.suusarent.suusarentback.persistence.category.CategoryEquipmentSizeDto;
import com.suusarent.suusarentback.persistence.category.CategoryMapper;
import com.suusarent.suusarentback.persistence.category.CategoryRepository;
import com.suusarent.suusarentback.persistence.sizetype.SizeType;
import com.suusarent.suusarentback.persistence.sizetype.SizeTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private static final String REQUEST_PARAM_CATEGORY_ID = "categoryId";
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    private final SizeService sizeService;
    private final SizeTypeRepository sizeTypeRepository;

    public List<CategoryInfo> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categoryMapper.toCategoryInfos(categories);
    }

    public void deleteCategory(Integer categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException(REQUEST_PARAM_CATEGORY_ID, categoryId));
        categoryRepository.delete(category);
    }

    public void addCategory(CategoryDto categoryDto) {
        validateCategoryNameIsAvailable(categoryDto);
        createAndSaveCategory(categoryDto);
    }

    private void validateCategoryNameIsAvailable(CategoryDto categoryDto) {
        if (categoryRepository.categoryExistsBy(categoryDto.getCategoryName())) {
            throw new ForbiddenException(Error.CATEGORY_ALREADY_EXISTS.getMessage(), Error.CATEGORY_ALREADY_EXISTS.getErrorCode());
        }
    }

    private void createAndSaveCategory(CategoryDto categoryDto) {
        Category category = createCategory(categoryDto);
        categoryRepository.save(category);
    }

    private Category createCategory(CategoryDto categoryDto) {
        SizeType sizeType = getValidSizeType(categoryDto.getSizeTypeId());
        Category category = categoryMapper.toCategoryDto(categoryDto);
        category.setSizeType(sizeType);
        return category;
    }

    private SizeType getValidSizeType(Integer sizeTypeId) {
        SizeType sizeType = sizeTypeRepository.findById(sizeTypeId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("sizeTypeId", sizeTypeId));
        return sizeType;
    }

    public void getCategorySize(CategoryEquipmentSizeDto categoryEquipmentSizeDto) {
        categoryEquipmentSizeDto.getId();

    }

}
