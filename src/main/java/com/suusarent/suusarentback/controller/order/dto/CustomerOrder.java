package com.suusarent.suusarentback.controller.order.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO for {@link com.suusarent.suusarentback.persistence.order.Order}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder implements Serializable {
    private String orderNumber;
    private LocalDate start;
    private LocalDate end;
    private String status;
    private String userFirstName;
    private String userLastName;
    private String userPhone;
    private String userEmail;
    private BigDecimal totalPrice;

}