package com.suusarent.suusarentback.presistence.order;

import com.suusarent.suusarentback.presistence.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "\"order\"", schema = "suusarent")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "start")
    private LocalDate start;

    @Column(name = "\"end\"")
    private LocalDate end;

    @Size(max = 3)
    @NotNull
    @Column(name = "status", nullable = false, length = 3)
    private String status;

    @NotNull
    @Column(name = "total_price", nullable = false, precision = 7, scale = 2)
    private BigDecimal totalPrice;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @NotNull
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

}