package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.item.dto.ItemDto;
import com.suusarent.suusarentback.infrastructure.exception.PrimaryKeyNotFoundException;
import com.suusarent.suusarentback.persistence.category.Category;
import com.suusarent.suusarentback.persistence.category.CategoryMapper;
import com.suusarent.suusarentback.persistence.category.CategoryRepository;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSize;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSizeRepository;
import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.item.ItemMapper;
import com.suusarent.suusarentback.persistence.item.ItemRepository;
import com.suusarent.suusarentback.persistence.itemimage.ItemImage;
import com.suusarent.suusarentback.persistence.itemimage.ItemImageRepository;
import com.suusarent.suusarentback.util.BytesConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemMapper itemMapper;
    private final ItemImageRepository itemImageRepository;
    private final ItemRepository itemRepository;
    private final EquipmentSizeRepository equipmentSizeRepository;
    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public void addItem(ItemDto itemDto) {
        Item item = createAndSaveItem(itemDto);
        handleAddItemImage(itemDto, item);
    }

    private Item createAndSaveItem(ItemDto itemDto) {
        // ITEM CREATE AND SAVE
        Item item = createItem(itemDto);
        itemRepository.save(item);
        return item;
    }

    private Item createItem(ItemDto itemDto) {

        Category category = getValidCategory(itemDto.getCategoryId());
        EquipmentSize equipmentSize = getValidEquipmentSize(itemDto.getEquipmentSizeId());

        Item item = itemMapper.toItem(itemDto);
        item.setCategory(category);
        item.setEquipmentSize(equipmentSize);
        return item;
    }


    private void handleAddItemImage(ItemDto itemDto, Item item) {
        if (!itemDto.getItemImageData().isEmpty()) {
            ItemImage itemImage = createItemImage(itemDto, item);
            itemImageRepository.save(itemImage);
        }
    }

    private static ItemImage createItemImage(ItemDto itemDto, Item item) {
        ItemImage itemImage = new ItemImage();
        itemImage.setData(BytesConverter.stringToBytes(itemDto.getItemImageData()));
        itemImage.setItem(item);
        return itemImage;
    }


    private Category getValidCategory(Integer categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("categoryId", categoryId));
    }

    private EquipmentSize getValidEquipmentSize(Integer equipmentSizeId) {
        return equipmentSizeRepository.findById(equipmentSizeId)
                .orElseThrow(() -> new PrimaryKeyNotFoundException("equipmentSizeId", equipmentSizeId));
    }
}




