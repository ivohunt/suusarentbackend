package com.suusarent.suusarentback.persistence.sizetype;

import com.suusarent.suusarentback.controller.user.dto.SizeTypeInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SizeTypeMapper {

    @Mapping(source = "id", target = "sizeTypeId")
    @Mapping(source = "name", target = "sizeTypeName")
    SizeTypeInfo toSizeTypeInfo(SizeType sizeType);

    List<SizeTypeInfo> toSizeTypeInfos(List<SizeType> sizeTypes);

}