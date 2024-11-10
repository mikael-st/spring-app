package com.murdock.spring_app.modules.order.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murdock.spring_app.modules.products.model.Product;

public interface OrderRepository extends JpaRepository<Product, UUID> {}
