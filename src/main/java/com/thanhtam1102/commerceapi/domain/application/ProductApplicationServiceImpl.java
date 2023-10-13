package com.thanhtam1102.commerceapi.domain.application;

import com.thanhtam1102.commerceapi.domain.application.dtos.product.command.CreateProductCommand;
import com.thanhtam1102.commerceapi.domain.application.dtos.product.responses.ProductCreatedResponse;
import com.thanhtam1102.commerceapi.domain.application.ports.input.ProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductApplicationServiceImpl implements ProductApplicationService {

    @Autowired
    private ProductCreatedEventHandler productCreatedEventHandler;

    @Override
    public ProductCreatedResponse createProduct(CreateProductCommand createProductRequest) {
        return productCreatedEventHandler.createProduct(createProductRequest);
    }
}
