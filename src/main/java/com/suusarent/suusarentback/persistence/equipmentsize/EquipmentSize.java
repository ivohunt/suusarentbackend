package com.suusarent.suusarentback.persistence.equipmentsize;

import com.suusarent.suusarentback.persistence.sizetype.SizeType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "equipment_size", schema = "suusarent")
public class EquipmentSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "size_type_id", nullable = false)
    private SizeType sizeType;

    @Size(max = 16)
    @NotNull
    @Column(name = "name", nullable = false, length = 16)
    private String name;

    @NotNull
    @Column(name = "sequence", nullable = false)
    private Integer sequence;

}