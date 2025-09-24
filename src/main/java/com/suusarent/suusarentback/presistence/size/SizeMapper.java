package com.suusarent.suusarentback.presistence.size;

import com.suusarent.suusarentback.controller.user.dto.SizeTypeInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SizeMapper {


    @Mapping(source = "sizeType", target = "sizeType")
    SizeTypeInfo toSizeTypeInfo(Size size);

    List<SizeTypeInfo> toSizeTypeInfos(List<Size> sizes);

}