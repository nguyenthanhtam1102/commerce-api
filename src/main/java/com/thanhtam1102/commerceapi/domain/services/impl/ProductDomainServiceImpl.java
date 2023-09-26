package com.thanhtam1102.commerceapi.domain.services.impl;

import com.thanhtam1102.commerceapi.domain.events.ProductCreatedEvent;
import com.thanhtam1102.commerceapi.domain.entities.Product;
import com.thanhtam1102.commerceapi.domain.services.ProductDomainService;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class ProductDomainServiceImpl implements ProductDomainService {

    private static final String TIME_ZONE_ID = "UTC";

    @Override
    public ProductCreatedEvent createProduct(Product product) {
        product.validateProduct();
        return new ProductCreatedEvent(product, ZonedDateTime.now(ZoneId.of(TIME_ZONE_ID)));
    }

}
