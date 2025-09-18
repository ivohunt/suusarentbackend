package com.suusarent.suusarentback.presistence.size;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "size", schema = "suusarent")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @jakarta.validation.constraints.Size(max = 16)
    @NotNull
    @Column(name = "name", nullable = false, length = 16)
    private String name;

    @jakarta.validation.constraints.Size(max = 5)
    @NotNull
    @Column(name = "size_type", nullable = false, length = 5)
    private String sizeType;

    @NotNull
    @Column(name = "sequence", nullable = false)
    private Integer sequence;

}