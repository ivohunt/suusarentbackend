package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.equipmentsizecontroller.dto.EquipmentSizeInfo;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSize;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSizeMapper;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSizeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentSizeService {

    private final EquipmentSizeRepository equipmentSizeRepository;
    private final EquipmentSizeMapper equipmentSizeMapper;

    public EquipmentSizeService(EquipmentSizeRepository equipmentSizeRepository, EquipmentSizeMapper equipmentSizeMapper) {
        this.equipmentSizeRepository = equipmentSizeRepository;
        this.equipmentSizeMapper = equipmentSizeMapper;
    }

    public List<EquipmentSizeInfo> getEquipmentSizes(Integer sizeTypeId) {
        List<EquipmentSize> equipmentSizes = equipmentSizeRepository.findEquipmentSizesBy(sizeTypeId);
        return equipmentSizeMapper.toEquipmentSizeInfos(equipmentSizes);

    }

}
