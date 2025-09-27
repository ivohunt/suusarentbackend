package com.suusarent.suusarentback.controller.order;

import com.suusarent.suusarentback.controller.order.dto.OrderDatesInfo;
import com.suusarent.suusarentback.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

@PostMapping("/order")
    @Operation(description = "Laenutuse kuupäevade lisamine ja order entity loomine")
    
    public void addDatesAndCreateOrder(@RequestBody @Valid OrderDatesInfo orderDatesInfo, @RequestParam Integer userId) {
        orderService.addDatesAndCreateOrder (orderDatesInfo, userId);
    }

}
