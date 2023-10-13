package com.thanhtam1102.commerceapi.ui.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class CreateProductApiRequest {

    @NotBlank(message = "name must be not blank")
    private final String name;
    private final String sku;

    @NotNull(message = "price must be not null")
    @DecimalMin(value = "0.0", inclusive = true, message = "price must be greater than or equal zero")
    private final BigDecimal price;
    private final String description;

    @NotNull(message = "quantity must be not null")
    @Min(value = 0, message = "quantity must be greater than or equal zero")
    private final Integer quantity;

    private final Boolean active;
    private final List<String> categories;
    private final List<String> assets;

}
