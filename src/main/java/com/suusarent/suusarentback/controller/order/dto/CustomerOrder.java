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
public class CustomerOrder implements Serializable {
    @NotNull
    private String orderNumber;
    @NotNull
    private LocalDate start;
    @NotNull
    private LocalDate end;
    @NotNull
    private String status;
    @NotNull
    private String userFirstName;
    @NotNull
    private String userLastName;
    @NotNull
    private String userPhone;
    @NotNull
    private String userEmail;

}