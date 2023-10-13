package com.thanhtam1102.commerceapi.data_access.adapter;

import com.thanhtam1102.commerceapi.domain.application.ports.output.ProductApplicationRepository;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Money;
import com.thanhtam1102.commerceapi.domain.domain_core.entities.Product;
import com.thanhtam1102.commerceapi.infrastructure.entities.JpaProduct;
import com.thanhtam1102.commerceapi.data_access.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductApplicationRepositoryImpl implements ProductApplicationRepository {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return toProduct(productRepository.save(toJpaProduct(product)));
    }

    public JpaProduct toJpaProduct(Product product) {
        return new JpaProduct(
                product.getName(),
                product.getSku(),
                product.getPrice().getAmount(),
                product.getDescription(),
                product.getQuantity(),
                product.getActive()
        );
    }

    public Product toProduct(JpaProduct jpaProduct) {
        return new Product(
                jpaProduct.getName(),
                jpaProduct.getSku(),
                new Money(jpaProduct.getPrice()),
                jpaProduct.getDescription(),
                jpaProduct.getQuantity(),
                null,
                jpaProduct.getActive()
        );
    }
}
