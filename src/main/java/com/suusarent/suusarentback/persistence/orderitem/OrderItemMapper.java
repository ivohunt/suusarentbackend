package com.suusarent.suusarentback.persistence.orderitem;

import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    @Mapping(source = "id", target = "orderItemId")
    @Mapping(source = "order.id", target = "orderId")
    @Mapping(source = "item.id", target = "itemId")
    OrderItemsResponse toOrderItemResponse(OrderItem orderItem);
}