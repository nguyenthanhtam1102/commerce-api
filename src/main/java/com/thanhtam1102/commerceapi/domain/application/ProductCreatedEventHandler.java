package com.thanhtam1102.commerceapi.domain.application;

import com.thanhtam1102.commerceapi.domain.application.dtos.product.command.CreateProductCommand;
import com.thanhtam1102.commerceapi.domain.application.dtos.product.responses.ProductCreatedResponse;
import com.thanhtam1102.commerceapi.domain.application.mappers.ProductMapper;
import com.thanhtam1102.commerceapi.domain.application.ports.output.ProductApplicationRepository;
import com.thanhtam1102.commerceapi.domain.domain_core.events.ProductCreatedEvent;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;
import com.thanhtam1102.commerceapi.domain.domain_core.services.ProductDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductCreatedEventHandler {

    private final ProductDomainService productDomainService;
    private final ProductApplicationRepository productRepository;

    @Autowired
    public ProductCreatedEventHandler(ProductDomainService productDomainService,
                                      @Qualifier("productApplicationRepositoryImpl") ProductApplicationRepository productRepository) {
        this.productDomainService = productDomainService;
        this.productRepository = productRepository;
    }

    public ProductCreatedResponse createProduct(CreateProductCommand createProductRequest) {
        Product product = ProductMapper.createProductRequestToProduct(createProductRequest);
        ProductCreatedEvent productCreatedEvent = productDomainService.createProduct(product);
        productRepository.save(product);
        return ProductMapper.productToProductCreatedResponse(productCreatedEvent.getProduct());
    }

}
