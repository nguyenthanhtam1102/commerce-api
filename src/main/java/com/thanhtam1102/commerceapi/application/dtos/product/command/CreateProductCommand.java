package com.thanhtam1102.commerceapi.application.dtos.product.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class CreateProductCommand {

    private final String name;
    private final String sku;
    private final BigDecimal price;
    private final String description;
    private final Integer quantity;
    private final Boolean active;

}
