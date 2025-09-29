package com.suusarent.suusarentback.persistence.order;

import com.suusarent.suusarentback.controller.order.dto.OrderDatesInfo;
import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {


    @Mapping(source = "orderStart", target = "start")
    @Mapping(source = "orderEnd", target = "end")
    Order toOrderDates(OrderDatesInfo orderDatesInfo);

    @Mapping(source = "id", target = "orderId")
    OrderDto toDto(Order order);

    List<OrderDto> toOrderInfos(List<Order> orders);

}