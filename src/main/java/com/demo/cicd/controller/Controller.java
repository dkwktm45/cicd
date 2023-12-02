package com.demo.cicd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

  @GetMapping("/health-check")
  public String health(){
    log.info("teste");
    log.warn("teste");
    log.debug("teste");
    log.info("teste");

    return "health-server";
  }
}
