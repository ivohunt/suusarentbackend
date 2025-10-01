package com.suusarent.suusarentback.persistence.orderitem;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.order.dto.OrderItemRequestDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.Instant;

@Mapper(componentModel = "spring", imports = {Status.class, Instant.class})
public interface OrderItemMapper {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    @Mapping(source = "id", target = "orderItemId")
    @Mapping(source = "order.id", target = "orderId")
    @Mapping(source = "item.id", target = "itemId")
    OrderItemsResponse toOrderItemResponse(OrderItem orderItem);

    @Mapping(source = "price", target = "price")
    @Mapping(expression = "java(Instant.now())", target = "timestamps")
    OrderItem toOrderItem(OrderItemRequestDto dto);


}