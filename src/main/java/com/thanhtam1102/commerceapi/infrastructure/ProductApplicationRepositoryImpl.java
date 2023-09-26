package com.thanhtam1102.commerceapi.infrastructure;

import com.thanhtam1102.commerceapi.application.ports.output.ProductApplicationRepository;
import com.thanhtam1102.commerceapi.domain.entities.Money;
import com.thanhtam1102.commerceapi.domain.entities.Product;
import com.thanhtam1102.commerceapi.infrastructure.entities.JpaProduct;
import com.thanhtam1102.commerceapi.infrastructure.repositories.ProductRepository;
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
