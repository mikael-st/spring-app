package com.murdock.spring_app.modules.order.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.murdock.spring_app.modules.itens.model.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
  @Id
  private UUID number;

  private LocalDate date;
  private Item      items;
  

  public Order(){};
  
}
