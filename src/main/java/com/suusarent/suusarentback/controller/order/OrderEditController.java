package com.suusarent.suusarentback.controller.order;

import com.suusarent.suusarentback.controller.order.dto.OrderDto;
import com.suusarent.suusarentback.service.OrderEditService;
import com.suusarent.suusarentback.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderEditController {

    private final OrderService orderService;


    @GetMapping("/order")
    @Operation (summary= "Leiab orderId järgi tellimuse, millega edasi tegeleda")
    public OrderDto findOrder(@RequestParam Integer orderId){
        return null;
    }

}
