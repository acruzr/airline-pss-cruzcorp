package com.airline.pss.searchservice.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;

@EnableBinding(SearchSink.class)
public class Receiver {

  @Autowired
  private HelloReactiveComponent helloReactiveComponent;

  @ServiceActivator(inputChannel = SearchSink.INVENTORYQ)
  public void accept(String message){
    System.out.println("Message came from Book service: "+message);
    helloReactiveComponent.testReactiveSearchService(message);
  }

}

interface SearchSink {

  public static final String INVENTORYQ = "inventoryQ";

  @Input(INVENTORYQ)
  public MessageChannel inventoryQ();
}
