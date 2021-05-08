package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;
import ar.edu.unju.fi.tp4.util.TablaCompra;
@Service
public class CompraServiceImp implements ICompraService {
	private List<Compra> compras;
	private static final Log LOGGER =LogFactory.getLog(CompraServiceImp.class);
	@Autowired
	@Qualifier("unaCompra")
	Compra compra;
	
	@Override
	public void guardarCompra(Compra compra) {
		// TODO Auto-generated method stub
		compras.add(compra);
		LOGGER.info("METHOD: se agrego un obj compra a la lista -> "+compras.get(compras.size()-1));
		
	}

	@Override
	public List<Compra> obtenerCompras() {
		// TODO Auto-generated method stub
		LOGGER.info("METHOD: mostrar obj de la lista -> "+compras.get(compras.size()-1));
		return compras;
	}

	@Override
	public void generarTablaCompra() {
		// TODO Auto-generated method stub
		compras=TablaCompra.listCompras;
		compras.add(new Compra(0, null, 0, 0));
		LOGGER.info("RESULT : CREA LISTA DE CLIENTES");
	}

	@Override
	public Compra getCompra() {
		// TODO Auto-generated method stub
		return compra;
	}

}
