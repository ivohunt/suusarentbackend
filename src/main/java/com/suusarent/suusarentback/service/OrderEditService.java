package com.suusarent.suusarentback.service;


import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderEditRepository;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderEditService {

    // private final OrderEditMapper orderEditMapper;
    private final OrderEditRepository orderEditRepository;
    private final OrderRepository orderRepository;

    @Transactional
    public void addOrder(OrderDto orderDto) {
        Order order = createAndSaveOrder(orderDto);
        handleAddCustomerInfo(orderDto.getOrderInfo(), order);
    }

    private Order createAndSaveOrder(OrderDto orderDto) {
        Order order = createOrder(orderDto);
        orderRepository.save(order);
        return order;
    }


}

