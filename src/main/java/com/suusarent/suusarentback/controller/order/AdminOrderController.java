package com.suusarent.suusarentback.controller.order;

import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.service.AdminOrderService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminOrderController {

    private final AdminOrderService adminOrderService;

    @GetMapping("/all-orders")
    @Operation(summary = "Leiab adminile kõik olemasolevad tellimused")
    public List<OrderDto> getAllOrders() {
        return adminOrderService.getAllOrders();
    }
}
