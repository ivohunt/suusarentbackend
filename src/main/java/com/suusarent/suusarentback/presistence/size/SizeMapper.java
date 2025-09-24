package com.suusarent.suusarentback.presistence.size;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SizeMapper {


    @Mapping(source = "sizeType", target = "sizeType")
    SizeTypeInfo toSizeTypeInfo(Size size);

    List<SizeTypeInfo> toSizeTypeInfos(List<Size> sizes);

}