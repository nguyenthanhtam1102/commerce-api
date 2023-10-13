package com.thanhtam1102.commerceapi.domain.domain_core.services;

import com.thanhtam1102.commerceapi.domain.domain_core.events.ProductCreatedEvent;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDomainService {

    ProductCreatedEvent createProduct(Product product);

}
