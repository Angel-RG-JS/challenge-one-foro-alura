package com.alura.foro_inicial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	@RequestMapping("/hola")
	public String hola() {
		return "Hola, comunidad ONE :)";
	}
}
