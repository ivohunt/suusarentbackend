package com.suusarent.suusarentback.persistence.equipmentsize;

import com.suusarent.suusarentback.controller.equipmentsizecontroller.dto.EquipmentSizeInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EquipmentSizeMapper {

    @Mapping(source = "id", target = "equipmentSizeId")
    @Mapping(source = "name", target = "equipmentSizeName")
    EquipmentSizeInfo toEquipmentSizeInfo(EquipmentSize equipmentSize);


    List<EquipmentSizeInfo> toEquipmentSizeInfos(List<EquipmentSize> equipmentSizes);


}