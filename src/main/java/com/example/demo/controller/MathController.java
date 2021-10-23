package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Math;

@RestController
public class MathController {
Math m;
@PostMapping("calculer")
public String calculer(@RequestParam int v1,@RequestParam int v2)
{
m=new Math();
return " la somme de " + v1 + " et `"
		+ "" + v2 + " est: " + m.somme(v1, v2) +"`"
				+ " et leurs produits est" + m.produit(v1, v2);


}
@GetMapping("/fact")
public String facto(@RequestParam int v)
{
	m=new Math();
	return "la factoriel de "+v+" est "+m.factoriel(v);
}
}
