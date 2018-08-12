package com.airline.pss.bookservice.com.airline.pss.bookservice.configurations;

public class DataSourceDump {

  private String name;

  public DataSourceDump(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return super.toString()+"{{ name: "+name+" }}";
  }
}
