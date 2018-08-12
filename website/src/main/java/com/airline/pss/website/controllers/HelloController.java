package com.airline.pss.website.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

  @Value("${message:default}")
  private String testProperty;

  @GetMapping("/test")
  public String testWebSiteService(){
    return testProperty;
  }
}
