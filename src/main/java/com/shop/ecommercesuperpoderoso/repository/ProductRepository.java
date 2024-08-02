package com.shop.ecommercesuperpoderoso.repository;

import com.shop.ecommercesuperpoderoso.models.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
