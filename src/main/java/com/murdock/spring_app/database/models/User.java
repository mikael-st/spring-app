package com.murdock.spring_app.database.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  public UUID id;

  public String username;

  public String pass;

  public String phone;

  public User() {}

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  @Override
	public String toString() {
		return "User {\nid:" + id + ";\nusername:" + username + ";\npass:" + pass + ";\n}";
	}
}
