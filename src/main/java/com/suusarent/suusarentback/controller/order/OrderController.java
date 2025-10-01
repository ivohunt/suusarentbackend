package com.suusarent.suusarentback.controller.order;

import com.suusarent.suusarentback.controller.order.dto.*;
import com.suusarent.suusarentback.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    @Operation(description = "Laenutuse kuupäevade lisamine ja order entity loomine")
    public OrderResponse createOrder(@RequestBody @Valid OrderRequestDto orderRequestDto) {
        return orderService.createOrder(orderRequestDto);
    }

    @GetMapping("/order/open")
    public OrderResponse getOpenOrder(@RequestParam Integer userId) {

        return orderService.getOpenOrder(userId);
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

    @PutMapping("/{orderId}/update")
    public OrderResponse updateOrder(@PathVariable Integer orderId) {
        return orderService.updateOrderTotals(orderId);
    }

}
