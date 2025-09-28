package com.suusarent.suusarentback.controller.order.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.suusarent.suusarentback.persistence.order.Order}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto implements Serializable {
    @NotNull
    private Integer orderId;
    @NotNull
    private String orderNumber;
    @NotNull
    private LocalDate start;
    @NotNull
    private LocalDate end;
    @NotNull
    private String status;
}