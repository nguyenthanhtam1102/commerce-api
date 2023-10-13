package com.thanhtam1102.commerceapi.domain.domain_core.events;

import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;

import java.time.ZonedDateTime;

public class ProductCreatedEvent implements DomainEvent<Product> {

    private final Product product;
    private final ZonedDateTime createdAt;

    public ProductCreatedEvent(Product product, ZonedDateTime createdAt) {
        this.product = product;
        this.createdAt = createdAt;
    }

    public Product getProduct() {
        return product;
    }

}
