package com.jiyuanwai.base.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BaseBackendApplicationTests {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void contextLoads() {
    assertTrue(((ConfigurableApplicationContext) applicationContext).isActive());
  }

}
