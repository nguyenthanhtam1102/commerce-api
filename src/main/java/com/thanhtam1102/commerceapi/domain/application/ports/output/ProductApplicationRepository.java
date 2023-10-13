package com.thanhtam1102.commerceapi.domain.application.ports.output;

import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductApplicationRepository {

    Product save(Product product);

}
