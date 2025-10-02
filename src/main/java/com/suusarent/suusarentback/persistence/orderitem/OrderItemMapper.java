package com.suusarent.suusarentback.persistence.orderitem;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.order.dto.OrderItemRequestDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import com.suusarent.suusarentback.controller.orderitem.dto.OrderItemInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.Instant;
import java.util.List;

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

    @Mapping(source = "id", target = "orderItemId")
    @Mapping(source = "item.category.name", target = "categoryName")
    @Mapping(source = "item.equipmentSize.name", target = "equipmentSize")
    @Mapping(source = "price", target = "price")
    OrderItemInfo toOrderItemInfos(OrderItem orderItem);

    List<OrderItemInfo> toOrderItemInfos(List<OrderItem> orderItems);
}