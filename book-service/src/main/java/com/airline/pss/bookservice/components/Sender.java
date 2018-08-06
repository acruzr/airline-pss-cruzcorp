package com.airline.pss.bookservice.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/*
  here there is another way to connect to the queu but is too much verbosity and you need to qualified two times with the
  queue in the interface and again in the sender class. to much
 */
@Component
@EnableBinding(BookingSource.class)
public class Sender {

  //@Autowired
  //@Output(BookingSource.INVENTORYQ)
  //private MessageChannel messageChannel;
  @Autowired
  private BookingSource bookingSource;

  public void send(Object message){
    //messageChannel.send(MessageBuilder.withPayload(message).build());
    bookingSource.inventoryQ().send(MessageBuilder.withPayload(message).build());
  }
}

@Component
interface BookingSource {

  public static final String INVENTORYQ = "inventoryQ";

  @Output(INVENTORYQ)
  public MessageChannel inventoryQ();
}


