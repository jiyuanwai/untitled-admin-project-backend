package com.jiyuanwai.base.backend.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 *
 * @author xuning
 * @date 2020-02-09 21:16:26
 */
@RestController
@RequestMapping("/")
public class IndexController {

  @GetMapping
  public String helloSpringBoot() {
    return "Hello Spring Boot!";
  }
}
