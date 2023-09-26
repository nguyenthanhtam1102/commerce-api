package com.thanhtam1102.commerceapi.application.ports.input;

import com.thanhtam1102.commerceapi.application.dtos.product.command.CreateProductCommand;
import com.thanhtam1102.commerceapi.application.dtos.product.responses.ProductCreatedResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface ProductApplicationService {

    ProductCreatedResponse createProduct(@Valid CreateProductCommand createProductCommand);

}
