package com.airline.pss.bookservice.com.airline.pss.bookservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//if you put export spring_profiles_active=dev when running the project this class will be created
//because of the profile annotation.
@Configuration
@Profile("dev")
public class DevDataSourceConfig {

  @Bean
  public DataSourceDump setUp() {
    return new DataSourceDump("Configuring development data source.");
  }
}
