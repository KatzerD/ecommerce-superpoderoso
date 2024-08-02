package com.shop.ecommercesuperpoderoso.repository;

import com.shop.ecommercesuperpoderoso.models.PaymentDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailRepository extends JpaRepository<PaymentDetailsEntity, Integer> {
}
