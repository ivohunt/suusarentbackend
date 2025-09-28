package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.controller.order.dto.OrderMapper;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDto> findOrders(Integer userId) {
        List<Order> orders = orderRepository.findByUserId(userId);
        List <OrderDto> orderInfos = orderMapper.toOrderInfos (orders);
        return orderInfos;

    }
}
