package com.duvalhub.rnd.dummyspringbootweb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DummyController {

  @RequestMapping
  public String hello() {
    return "Hello from dummy!";
  }
}
