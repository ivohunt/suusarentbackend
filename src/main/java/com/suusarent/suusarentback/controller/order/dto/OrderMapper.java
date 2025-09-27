package com.suusarent.suusarentback.controller.order.dto;

import com.suusarent.suusarentback.persistence.order.Order;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    @Mapping(source="orderStart", target = "start")
    @Mapping(source="orderEnd", target = "end")
    Order toOrderDates(OrderDatesInfo orderDatesInfo);

}