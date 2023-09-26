package com.thanhtam1102.commerceapi.domain.services;

import com.thanhtam1102.commerceapi.domain.events.ProductCreatedEvent;
import com.thanhtam1102.commerceapi.domain.entities.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDomainService {

    ProductCreatedEvent createProduct(Product product);

}
