package com.thanhtam1102.commerceapi.domain.application.mappers;

import com.thanhtam1102.commerceapi.domain.application.dtos.product.command.CreateProductCommand;
import com.thanhtam1102.commerceapi.domain.application.dtos.product.responses.ProductCreatedResponse;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Money;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;

public class ProductMapper {

    public static Product createProductRequestToProduct(CreateProductCommand createProductRequest) {
        return new Product(
                createProductRequest.getName(),
                createProductRequest.getSku(),
                new Money(createProductRequest.getPrice()),
                createProductRequest.getDescription(),
                createProductRequest.getQuantity(),
                null,
                createProductRequest.getActive()
        );
    }

    public static ProductCreatedResponse productToProductCreatedResponse(Product product) {
        return new ProductCreatedResponse(
                product.getId().getValue()
        );
    }

}
