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

    @GetMapping("/orders/all")
    @Operation(summary = "Leiab adminile kõik olemasolevad tellimused")
    public List<OrderDto> findAllOrders() {
        return orderService.findAllOrders();
    }

    @GetMapping("/order/customer")
    @Operation(summary = "Leiab orderId järgi kliendi tellimuse info")
    public CustomerOrder findCustomerOrder(@RequestParam Integer orderId) {
        return orderService.findCustomerOrder(orderId);
    }

    @PostMapping("/order")
    @Operation(description = "Laenutuse kuupäevade lisamine ja order entity loomine")
    public Integer createOrder(@RequestBody @Valid OrderRequestDto orderRequestDto) {
        return orderService.createOrder(orderRequestDto);
    }

    @PostMapping("/{orderId}/items")
    public OrderItemsResponse addItemToOrder(
            @PathVariable Integer orderId,
            @RequestBody AddOrderItemRequest request) {

        return orderService.addItemToOrder(orderId, request.getItemId());
    }

    @GetMapping("/order/open")
    public OrderResponse getOpenOrder(@RequestParam Integer userId) {

        return orderService.getOpenOrder(userId);
    }

    @GetMapping("/order/existing")
    public OrderResponse getExistingOrder(@RequestParam Integer orderId) {

        return orderService.getExistingOrder(orderId);
    }



    @GetMapping("/available-categories-with-items")
    public List<CategoryWithItemsDto> getAvailableCategoriesWithItems(
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate endDate) {
        return orderService.findAvailableCategoriesWithItems(startDate, endDate);
    }

    @GetMapping("/order-history")
    @Operation(summary = "Leiab userId järgi olemasolevad kasutaja tellimused")
    public List<OrderDto> findAllOrders(@RequestParam Integer userId) {
        return orderService.findOrders(userId);
    }

    @PutMapping("/{orderId}/update")
    public OrderResponse updateOrder(@PathVariable Integer orderId) {
        return orderService.updateOrderTotals(orderId);
    }

}
