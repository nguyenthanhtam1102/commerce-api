package com.thanhtam1102.commerceapi.infrastructure.entities;

import com.thanhtam1102.commerceapi.domain.entities.CategoryId;
import com.thanhtam1102.commerceapi.domain.entities.Money;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class JpaProduct {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 255, nullable = false)
    private String name;

    private String sku;

    @Column(nullable = false)
    private BigDecimal price;

    private String description;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Boolean active;

    @CreationTimestamp
    private ZonedDateTime created;

    @CreationTimestamp
    private ZonedDateTime updated;

    public JpaProduct(String name, String sku, BigDecimal price, String description,
                   Integer quantity, Boolean active) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.active = active;
    }

}
