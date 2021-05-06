package ar.edu.unju.fi.tp4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Controller creado unicamente para prueba local
@Controller
public class CompraController {
	@GetMapping("/compra")
	public String getCompra() {
		return "compra.html";
	}
	
}
