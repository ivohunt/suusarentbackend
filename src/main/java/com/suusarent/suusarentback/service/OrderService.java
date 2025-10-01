package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.order.dto.OrderDatesInfo;
import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.infrastructure.exception.PrimaryKeyNotFoundException;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderMapper;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemRepository;
import com.suusarent.suusarentback.persistence.user.User;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {


    private static final String REQUEST_PARAM_NAME_ORDER_ID = "orderId";
    private final OrderMapper orderMapper;

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    public void addDatesAndCreateOrder(OrderDatesInfo orderDatesInfo, Integer userId) {
        Order order = orderMapper.toOrderDates(orderDatesInfo);
        setAndSaveOrderInitialValues(userId, order);
        generateAndSetOrderNumber(order);
        orderRepository.save(order);
    }

    public List<OrderDto> findOrders(Integer userId) {
        List<Order> orders = orderRepository.findByUserId(userId);
        return orderMapper.toOrderInfos(orders);
    }


    private void generateAndSetOrderNumber(Order order) {
        Integer orderId = order.getId();
        order.setOrderNumber(generateOrderNumber(orderId));
    }

    private void setAndSaveOrderInitialValues(Integer userId, Order order) {
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(Instant.now());
        order.setStatus(Status.UNCONFIRMED.getCode());
        order.setOrderNumber("TBC");
        BigDecimal totalPrice = BigDecimal.valueOf(000.00);
        order.setTotalPrice(totalPrice);
        findAndSetUser(userId, order);
        orderRepository.save(order);
    }

    private void findAndSetUser(Integer userId, Order order) {
        User user = userRepository.findUserById(userId);
        order.setUser(user);
    }

    private String generateOrderNumber(Integer orderId) {
        String prefix = "SR";
        String idPart = String.valueOf(orderId);

        int totalLength = 8;
        int paddingLength = totalLength - prefix.length() - idPart.length();
        if (paddingLength < 0) {
            return prefix + idPart;
        }
        String padding = "0".repeat(paddingLength);
        return prefix + padding + idPart;
    }


}





