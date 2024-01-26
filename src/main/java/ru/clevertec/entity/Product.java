package ru.clevertec.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product", schema = "servlet")
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

//    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;

//    @Column(name = "wholesale_product")
    private Boolean wholesaleProduct;
}