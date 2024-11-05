package com.murdock.spring_app.entities.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murdock.spring_app.entities.products.model.Product;
import com.murdock.spring_app.entities.products.repository.ProductRepository;

import com.murdock.spring_app.interfaces.QueryInterface;

@Service
public class ProductService implements QueryInterface<Product> {
  @Autowired
  private ProductRepository repository;

  public List<Product> list() {
    return repository.findAll();
  }

  @Override
  public Product create() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public Product find() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }

  @Override
  public Product edit() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'edit'");
  }

  @Override
  public Product delete() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
}
