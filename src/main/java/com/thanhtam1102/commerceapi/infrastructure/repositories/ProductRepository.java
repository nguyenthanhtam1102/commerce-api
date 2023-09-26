package com.thanhtam1102.commerceapi.infrastructure.repositories;

import com.thanhtam1102.commerceapi.infrastructure.entities.JpaProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<JpaProduct, UUID> {

}
