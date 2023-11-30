package com.demo.cicd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @PostMapping("/health-check")
  public String health(){
    return "health-server";
  }
}
