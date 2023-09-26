package com.thanhtam1102.commerceapi.application.ports.output;

import com.thanhtam1102.commerceapi.domain.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductApplicationRepository {

    Product save(Product product);

}
