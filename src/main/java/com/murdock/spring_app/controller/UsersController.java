package com.murdock.spring_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murdock.spring_app.database.models.User;
import com.murdock.spring_app.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UsersService service;

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
