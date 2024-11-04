package com.murdock.spring_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.murdock.spring_app.database.models.User;
import com.murdock.spring_app.repository.UserRepository;

@Service
public class UsersService {

  @Autowired
  private UserRepository repository;

  public List<User> list() {
    return repository.findAll();
  }

  public User create(
    @RequestBody User user
  ) {      
    return repository.save(user);
  }
}