package edu.ifma.api.estacionamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexEstacionamento {
	@GetMapping
	public String index() {
		return "API DE ESTACIONAMENTO";
	}
}
