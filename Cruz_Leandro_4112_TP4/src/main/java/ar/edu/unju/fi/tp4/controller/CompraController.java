package ar.edu.unju.fi.tp4.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;

@Controller
public class CompraController {
	
	@Autowired
	@Qualifier("unaCompra")
	private Compra compra;
	
	@Autowired
	private ICompraService compraService;
	
	private static final Log LOGGER = LogFactory.getLog(CompraController.class);
	
	@GetMapping("/compra")
	public String getCompraPage(Model model) {
		LOGGER.info("CONTROLLER : CompraController with / Formulario get method");
		LOGGER.info("METHOD : getCompraPage()");
		LOGGER.info("RESULT : VISUALIZA LA PAGINA compras.html");
		model.addAttribute("compra",compra);
		return "compra";
	}
	
	@PostMapping("/compra/guardar")
	public String getAddCompraPage(@ModelAttribute("compra") Compra unaCompra) {	
		LOGGER.info("CONTROLLER : CompraController with /guardarCompra post method");
		compraService.guardarCompra(unaCompra);
		LOGGER.info("RESULT : VISUALIZA LA PAGINA resultadoCompra.html ");
		return "resultadoCompra";
	}
	
}

