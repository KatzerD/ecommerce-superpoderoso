package com.shop.ecommercesuperpoderoso.repository;

import com.shop.ecommercesuperpoderoso.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
