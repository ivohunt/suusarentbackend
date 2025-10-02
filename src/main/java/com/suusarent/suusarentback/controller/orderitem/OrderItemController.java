package com.suusarent.suusarentback.controller.orderitem;

import com.suusarent.suusarentback.controller.order.dto.OrderItemRequestDto;
import com.suusarent.suusarentback.controller.order.dto.OrderItemsResponse;
import com.suusarent.suusarentback.controller.orderitem.dto.OrderItemInfo;
import com.suusarent.suusarentback.persistence.orderitem.OrderItem;
import com.suusarent.suusarentback.service.OrderItemService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping("/order-items")
    public void addItem(@RequestParam Integer orderId, @RequestParam Integer itemId) {
        orderItemService.addItemToOrder(orderId, itemId);
    }

    @GetMapping("/order-items")
    @Operation(summary = "Leiab orderId järgi itemite info.")
    public List<OrderItemInfo> findOrderItems(@RequestParam Integer orderId) {
        return orderItemService.findOrderItems(orderId);
    }
}