package com.suusarent.suusarentback.controller.order.dto;

import com.suusarent.suusarentback.persistence.order.Order;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface OrderMapper {
    @Mapping(source = "orderId", target = "id")
    Order toEntity(OrderDto orderDto);

    @Mapping(source = "id", target = "orderId")
    OrderDto toDto(Order order);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
            @Mapping(source = "orderId", target = "id")
    Order partialUpdate(OrderDto orderDto, @MappingTarget Order order);

    List<OrderDto> toOrderInfos(List<Order> orders);
}