package com.thanhtam1102.commerceapi.domain.entities;

import com.thanhtam1102.commerceapi.domain.exceptions.DomainException;

import java.time.ZonedDateTime;
import java.util.Set;

public class Product extends BaseEntity<ProductId> {

    private String name;
    private String sku;
    private Money price;
    private String description;
    private Integer quantity;
    private Set<CategoryId> categories;
    private Boolean active;
    private ZonedDateTime created;
    private ZonedDateTime updated;

    public Product(String name, String sku, Money price, String description,
                   Integer quantity, Set<CategoryId> categories, Boolean active) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.categories = categories;
        this.active = active;
    }

    public void validateProduct() {
        validateName();
        validatePrice();
        validateQuantity();
    }

    public void validateName() {
        if(name == null || name.isBlank())
            throw new DomainException("Name must be not blank");
    }

    public void validatePrice() {
        if(price == null)
            throw new DomainException("Price must be not null");
        if(!price.isGreaterThanOrEqualZero())
            throw new DomainException("Price must be greater than or equal zero");
    }

    public void validateQuantity() {
        if(quantity == null)
            throw new DomainException("Quantity must be not null");;
        if(quantity.compareTo(0) < 0)
            throw new DomainException("Quantity must be greater than or equal zero");
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public Money getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Set<CategoryId> getCategories() {
        return categories;
    }

    public Boolean getActive() {
        return active;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public ZonedDateTime getUpdated() {
        return updated;
    }
}
