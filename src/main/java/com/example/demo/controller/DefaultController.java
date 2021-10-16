package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
@GetMapping("hello") // en accédant à localhost:8080/hello on affiche le résultat de la f
public String sayHello()
{
return "hello spring";	
}
}
