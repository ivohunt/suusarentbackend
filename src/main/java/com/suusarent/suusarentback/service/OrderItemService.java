package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.order.dto.OrderItemRequestDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.item.ItemRepository;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemMapper;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class OrderItemService {
    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;


    public OrderItemService(OrderRepository orderRepository,
                            ItemRepository itemRepository,
                            OrderItemRepository orderItemRepository, OrderItemMapper orderItemMapper) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderItemMapper = orderItemMapper;
    }

    public OrderItemsResponse addItemToOrder(OrderItemRequestDto dto) {
        OrderItem orderItem = orderItemMapper.toOrderItem(dto);

       Order order = orderRepository.findById(dto.getOrderId())
                .orElseThrow(() -> new RuntimeException("Order not found"));

        Item item = itemRepository.findById(dto.getItemId())
                .orElseThrow(() -> new RuntimeException("Item not found"));

        orderItem.setOrder(order);
        orderItem.setItem(item);

        OrderItem saved = orderItemRepository.save(orderItem);

        // Map to response
        return orderItemMapper.toOrderItemResponse(saved);
    }

}