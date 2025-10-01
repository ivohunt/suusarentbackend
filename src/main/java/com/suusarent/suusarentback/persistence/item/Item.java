package com.suusarent.suusarentback.persistence.item;

import com.suusarent.suusarentback.persistence.category.Category;
import com.suusarent.suusarentback.persistence.equipmentsize.EquipmentSize;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "item", schema = "suusarent")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    @Size(max = 10)
    @NotNull
    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Size(max = 500)
    @Column(name = "notes", length = 500)
    private String notes;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "equipment_size_id")
    private EquipmentSize equipmentSize;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @NotNull
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @NotNull
    @Column(name = "is_available", nullable = false)
    private Boolean isAvailable = false;

}