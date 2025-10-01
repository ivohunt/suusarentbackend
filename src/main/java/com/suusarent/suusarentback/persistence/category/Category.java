package com.suusarent.suusarentback.persistence.category;

import com.suusarent.suusarentback.persistence.item.Item;
import com.suusarent.suusarentback.persistence.sizetype.SizeType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "category", schema = "suusarent")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "size_type_id")
    private SizeType sizeType;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "price", nullable = false, precision = 5, scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Item> items = new ArrayList<>();

}