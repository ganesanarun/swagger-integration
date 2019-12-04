package com.thoughtworks.swaggerintegration;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
public class People {

  @PostMapping("people/post")
  public Mono<String> postHello() {
    return Mono.just("Awesome");
  }

  @GetMapping("people/{id}")
  public Mono<Person> getPerson(@PathVariable String id) {
    var person = new Person("It works!", 27);
    return Mono.just(person);
  }
}
