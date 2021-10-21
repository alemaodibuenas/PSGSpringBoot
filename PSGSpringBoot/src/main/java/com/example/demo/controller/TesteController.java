package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {
	
	@GetMapping("/get")
	public String testar() {
		return "teste realizado com sucesso";
	}
	
	@GetMapping("/get2")
	public String testar2() {
		return testar();
	}
}
