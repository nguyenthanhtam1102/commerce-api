package com.thanhtam1102.commerceapi.ui.mappers;

import com.thanhtam1102.commerceapi.application.dtos.product.command.CreateProductCommand;
import com.thanhtam1102.commerceapi.application.dtos.product.responses.ProductCreatedResponse;
import com.thanhtam1102.commerceapi.ui.dtos.CreateProductApiRequest;
import com.thanhtam1102.commerceapi.ui.dtos.ProductCreatedApiResponse;

public class ProductMapper {

    public static CreateProductCommand createProductApiRequestToCreateProductCommand(CreateProductApiRequest request) {
        return new CreateProductCommand(
                request.getName(),
                request.getSku(),
                request.getPrice(),
                request.getDescription(),
                request.getQuantity(),
                request.getActive()
        );
    }

    public static ProductCreatedApiResponse productCreatedResponseToProductCreatedApiResponse(ProductCreatedResponse response) {
        return new ProductCreatedApiResponse(
                response.getProductId().toString()
        );
    }

}
