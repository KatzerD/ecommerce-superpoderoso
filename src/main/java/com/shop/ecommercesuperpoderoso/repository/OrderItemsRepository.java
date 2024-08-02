package com.shop.ecommercesuperpoderoso.repository;

import com.shop.ecommercesuperpoderoso.models.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItemsEntity, Integer> {
}
