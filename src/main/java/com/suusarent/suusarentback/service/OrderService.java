package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.controller.order.dto.OrderDatesInfo;
import com.suusarent.suusarentback.controller.order.dto.OrderMapper;
import com.suusarent.suusarentback.persistence.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public void addDatesAndCreateOrder(OrderDatesInfo orderDatesInfo) {

        Order order = orderMapper.toOrderDates(OrderDatesInfo orderDatesInfo);


    }
}
