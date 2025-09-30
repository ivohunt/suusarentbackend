package com.suusarent.suusarentback.controller.order.dto;

import com.suusarent.suusarentback.controller.item.dto.ItemAvailableDto;
import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import com.suusarent.suusarentback.persistence.category.Category;
import com.suusarent.suusarentback.persistence.item.Item;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class CategoryWithItemsDto {
    private Integer categoryId;
    private String categoryName;
    private BigDecimal price;
    private List<ItemAvailableDto> availableItems;

    public CategoryWithItemsDto(Category category, List<Item> items) {
        this.categoryId = category.getId();
        this.categoryName = category.getName();
        this.price = category.getPrice();
        this.availableItems = items.stream()
                .map(ItemAvailableDto::new)
                .toList();
    }
}