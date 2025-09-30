package com.suusarent.suusarentback.controller.order;

import com.suusarent.suusarentback.controller.order.dto.*;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    @Operation(description = "Laenutuse kuupäevade lisamine ja order entity loomine")

    public void addDatesAndCreateOrder(@RequestBody @Valid OrderDatesInfo orderDatesInfo, @RequestParam Integer userId) {
        orderService.addDatesAndCreateOrder(orderDatesInfo, userId);
    }

    @PostMapping("/{orderId}/items")
    public OrderItemsResponse addItemToOrder(
            @PathVariable Integer orderId,
            @RequestBody AddOrderItemRequest request) {

        return orderService.addItemToOrder(orderId, request.getItemId());
    }

    @GetMapping("/available-categories-with-items")
    public List<CategoryWithItemsDto> getAvailableCategoriesWithItems(
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate endDate) {
        return orderService.findAvailableCategoriesWithItems(startDate, endDate);
    }



    @GetMapping("/order-history")
    @Operation(summary = "Leiab userId järgi olemasolevad kasutaja tellimused")
    public List<OrderDto> findOrders(@RequestParam Integer userId) {
        return orderService.findOrders(userId);
    }


}
