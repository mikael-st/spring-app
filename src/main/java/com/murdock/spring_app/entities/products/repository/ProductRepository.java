package com.murdock.spring_app.entities.products.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murdock.spring_app.entities.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {}
