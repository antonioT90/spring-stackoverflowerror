package com.example.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class ConsumerDemoConfig {

  @Bean
  public Consumer<String> consumerDemo(){
    return msg -> log.info(msg);
  }

}

