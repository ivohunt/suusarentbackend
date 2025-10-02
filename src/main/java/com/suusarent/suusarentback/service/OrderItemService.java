package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.orderitem.dto.OrderItemInfo;
import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.item.ItemRepository;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemMapper;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;


@Service
@AllArgsConstructor
public class OrderItemService {
    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;


    public void addItemToOrder( Integer orderId, Integer itemId) {
        OrderItem orderItem = new OrderItem();

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found"));

        orderItem.setOrder(order);
        orderItem.setItem(item);
        orderItem.setTimestamps(Instant.now());
        orderItem.setPrice(BigDecimal.valueOf(000.00));
        orderItemRepository.save(orderItem);

    }

    public List<OrderItemInfo> findOrderItems(Integer orderId) {
        List<OrderItem> orderItems = orderItemRepository.findByOrderId(orderId);
        return orderItemMapper.toOrderItemInfos(orderItems);
    }
}