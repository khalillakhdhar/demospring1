package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DefaultController {
@GetMapping("hello") // en accédant à localhost:8080/hello on affiche le résultat de la f
public ModelAndView sayHello()
{
	
	ModelAndView mv=new ModelAndView("hello.html");
	return mv;
}
@GetMapping("controllers")
public String control()
{
return "i am controller";	
}
@GetMapping("rest")
public String restfull()
{
return "i am restfull controller";	
}
}
