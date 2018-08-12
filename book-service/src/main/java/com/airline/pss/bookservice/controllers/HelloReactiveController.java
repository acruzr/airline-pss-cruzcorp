package com.airline.pss.bookservice.controllers;

import com.airline.pss.bookservice.components.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloReactiveController {

  @Autowired
  private Sender sender;
  @Value("${message:default}")
  private String property;

  @GetMapping("/reactiveTest")
  public void testReactiveBookService() {
    sender.send(property);
  }
}
