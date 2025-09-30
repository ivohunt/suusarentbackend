package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderMapper;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminOrderService {

    private final OrderMapper orderMapper;

    private final OrderRepository orderRepository;

    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.toOrderInfos(orders);

    }

}
