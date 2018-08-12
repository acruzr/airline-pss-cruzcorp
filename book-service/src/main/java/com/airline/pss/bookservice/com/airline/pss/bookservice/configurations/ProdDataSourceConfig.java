package com.airline.pss.bookservice.com.airline.pss.bookservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdDataSourceConfig {

  @Bean
  public DataSourceDump setupDataSource() {
    return new DataSourceDump("Configuring testing data source.");
  }
}
