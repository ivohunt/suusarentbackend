package com.suusarent.suusarentback.service;


import com.suusarent.suusarentback.persistence.order.OrderEditRepository;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderEditService {

    // private final OrderEditMapper orderEditMapper;
    private final OrderEditRepository orderEditRepository;
    private final OrderRepository orderRepository;


}

