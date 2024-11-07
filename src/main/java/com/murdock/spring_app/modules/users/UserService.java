package com.murdock.spring_app.modules.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

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