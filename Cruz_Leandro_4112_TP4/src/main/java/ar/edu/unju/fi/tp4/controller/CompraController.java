package ar.edu.unju.fi.tp4.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;

@Controller
public class CompraController {
	
	@Autowired
	private ICompraService compraService;
	
	private static final Log LOGGER = LogFactory.getLog(CompraController.class);
	
	@GetMapping("/compra")
	public String getCompraPage(Model model) {
		LOGGER.info("CONTROLLER : CompraController with / Formulario get method");
		LOGGER.info("METHOD : getCompraPage()");
		LOGGER.info("RESULT : VISUALIZA LA PAGINA compras.html");
		model.addAttribute(compraService.getCompra());
		return "compra";
	}
	
	@PostMapping("/compra/guardar")
	public String getAddCompraPage(@ModelAttribute("compra") Compra unaCompra) {	
		LOGGER.info("CONTROLLER : CompraController with /guardarCompra post method");
		compraService.guardarCompra(unaCompra);
		LOGGER.info("RESULT : VISUALIZA LA PAGINA resultadoCompra.html ");
		return "resultadoCompra";
	}

	@GetMapping("/compra/listado")
	public ModelAndView getComprasListPage() {
		LOGGER.info("CONTROLLER : CompraController with / compra/listado get method");
		LOGGER.info("METHOD : getComprasListPage()");
		ModelAndView modelView = new ModelAndView("compras");
		if (compraService.obtenerCompras() == null) {
			compraService.generarTablaCompra();
		}
		modelView.addObject("compras",compraService.obtenerCompras());
		LOGGER.info("RESULT : VISUALIZA LA PAGINA listacompras.html");
		return modelView;
	
	}
	
}
