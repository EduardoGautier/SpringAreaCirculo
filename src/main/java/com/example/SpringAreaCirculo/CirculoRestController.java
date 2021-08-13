package com.example.SpringAreaCirculo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Circulo;

@RestController
@RequestMapping("/")
public class CirculoRestController {

	
	@GetMapping("/")
	public Circulo CalculaArea (@RequestParam double raio) {
		Circulo c = new Circulo(raio);
		
		
		return c ;
		
	}

}
