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
    @Mapping(source = "orderNumber", target = "orderNumber")
    @Mapping(source = "start", target = "start")
    @Mapping(source = "end", target = "end")
    @Mapping(source = "totalPrice", target = "totalPrice")
    @Mapping(source = "status", target = "status")
    OrderDto toDto(Order order);

    List<OrderDto> toOrderInfos(List<Order> orders);

}