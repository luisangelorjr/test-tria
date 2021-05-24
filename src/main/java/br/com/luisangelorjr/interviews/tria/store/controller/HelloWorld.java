package br.com.luisangelorjr.interviews.tria.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	  @GetMapping("/")
	  String helloWorld() {
	    return "Hello World!";
	  }

}
