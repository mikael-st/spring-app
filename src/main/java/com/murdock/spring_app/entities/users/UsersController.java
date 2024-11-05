package com.murdock.spring_app.entities.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UserService service;

  @GetMapping
  public List<User> list () {
    return service.list();
  }

  @PostMapping
  public User create(
    @RequestBody User user 
  ) {
    return service.create(user);
  }
}
