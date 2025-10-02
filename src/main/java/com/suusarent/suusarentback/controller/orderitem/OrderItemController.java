package com.suusarent.suusarentback.controller.orderitem;

import com.suusarent.suusarentback.controller.order.dto.OrderItemRequestDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.service.OrderItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping
    public OrderItemsResponse addItem(@RequestBody OrderItemRequestDto dto) {
        OrderItemsResponse response = orderItemService.addItemToOrder(dto);
        return response;
    }

    @GetMapping("/order/")
    @Operation(summary = "Leiab orderId järgi itemite info.")
    public List<OrderItem> findOrderItems(@RequestParam Integer orderId) {
        List<OrderItem> orderItems = orderItemService.findOrderItems(orderId);
        return orderItems;
    }
}