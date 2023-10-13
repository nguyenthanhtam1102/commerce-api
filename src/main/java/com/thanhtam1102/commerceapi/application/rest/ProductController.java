package com.thanhtam1102.commerceapi.application.rest;

import com.thanhtam1102.commerceapi.domain.application.dtos.product.responses.ProductCreatedResponse;
import com.thanhtam1102.commerceapi.domain.application.ports.input.ProductApplicationService;
import com.thanhtam1102.commerceapi.ui.dtos.CreateProductApiRequest;
import com.thanhtam1102.commerceapi.ui.mappers.ProductMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductApplicationService productApplicationService;

    @PostMapping("")
    public ResponseEntity<?> createProduct(
            @Valid CreateProductApiRequest request
    ) {
        ProductCreatedResponse response = productApplicationService.createProduct(
                ProductMapper.createProductApiRequestToCreateProductCommand(request)
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ProductMapper.productCreatedResponseToProductCreatedApiResponse(response));
    }

}
