package com.airline.pss.searchservice.components;

import org.springframework.stereotype.Component;

@Component
public class HelloReactiveComponent {

  public void testReactiveSearchService(String message){
    System.out.println("Message in Search service: "+message);
  }
}
