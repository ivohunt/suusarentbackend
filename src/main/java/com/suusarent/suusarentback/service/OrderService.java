package com.suusarent.suusarentback.service;

import com.suusarent.suusarentback.Status;
import com.suusarent.suusarentback.controller.order.dto.CategoryWithItemsDto;
import com.suusarent.suusarentback.controller.order.dto.OrderDatesInfo;
import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import com.suusarent.suusarentback.persistence.category.Category;
import com.suusarent.suusarentback.persistence.category.CategoryRepository;
import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.item.ItemRepository;
import com.suusarent.suusarentback.persistence.order.Order;
import com.suusarent.suusarentback.persistence.order.OrderMapper;
import com.suusarent.suusarentback.persistence.order.OrderRepository;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemMapper;
import com.suusarent.suusarentback.persistence.orderitem.OrderItemRepository;
import com.suusarent.suusarentback.persistence.user.User;
import com.suusarent.suusarentback.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final CategoryRepository categoryRepository;
    private final ItemRepository itemRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;

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


    public List<CategoryWithItemsDto> findAvailableCategoriesWithItems(LocalDate startDate, LocalDate endDate) {
        List<Category> categories = categoryRepository.findAvailableCategoriesWithItems(startDate, endDate);

        return categories.stream()
                .map(category -> new CategoryWithItemsDto(category, category.getItems()))
                .toList();
    }

    public OrderItemsResponse addItemToOrder(Integer orderId, Integer itemId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found"));

        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order);
        orderItem.setItem(item);
        orderItem.setPrice(item.getCategory().getPrice());
        orderItem.setTimestamps(Instant.now());

        // Optionally mark item as unavailable
        item.setIsAvailable(false);
        itemRepository.save(item);

        orderItem = orderItemRepository.save(orderItem);

        // Map to DTO to avoid lazy-loading serialization issues
        return orderItemMapper.toOrderItemResponse(orderItem);
    }


    private void generateAndSetOrderNumber(Order order) {
        Integer orderId = order.getId();
        order.setOrderNumber(generateOrderNumber(orderId));
    }

    private void setAndSaveOrderInitialValues(Integer userId, Order order) {
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(Instant.now());
        order.setStatus(Status.UNCONFIRMED_RENTAL.getCode());
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
