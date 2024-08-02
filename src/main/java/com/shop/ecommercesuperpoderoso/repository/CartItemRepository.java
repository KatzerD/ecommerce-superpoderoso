package com.shop.ecommercesuperpoderoso.repository;

import com.shop.ecommercesuperpoderoso.models.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItemEntity, Integer> {
}
