package com.thanhtam1102.commerceapi.application.dtos.product.responses;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class ProductCreatedResponse {

    @NotNull
    private final UUID productId;

}
