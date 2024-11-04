package com.murdock.spring_app.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
  @GetMapping
  public Map<String, String> status() {
    return Map.of(
      "message", "OK"
    );
  }
}
