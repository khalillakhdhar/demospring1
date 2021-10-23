package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllers {
	@GetMapping("/api")
	public String getFoos(@RequestParam String id) {
	return "ID: " + id;
	}
	@PostMapping("/api")
	public String addFoo(@RequestParam(name = "id") String fooId,
	@RequestParam String name) {
	return "ID: " + fooId + " Name: " + name;
	}
}
