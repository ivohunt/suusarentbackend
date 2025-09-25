package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.item.dto.ItemAddDto;
import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.item.ItemAddMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemAddService {


    private final ItemAddMapper itemAddMapper;

    public void itemAdd(ItemAddDto itemAddDto) {

        Item item = itemAddMapper.toItem(itemAddDto);
    }
}
