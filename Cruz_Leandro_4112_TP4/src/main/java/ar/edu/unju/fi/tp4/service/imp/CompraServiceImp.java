package ar.edu.unju.fi.tp4.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;
@Service
public class CompraServiceImp implements ICompraService {
	private List<Compra> compras;
	private static final Log LOGGER =LogFactory.getLog(CompraServiceImp.class);

	@Override
	public void guardarCompra(Compra compra) {
		// TODO Auto-generated method stub
		compras.add(compra);
		LOGGER.info("METHOD: se agrego un obj producto a la lista -> "+compras.get(compras.size()-1));
	}

	@Override
	public List<Compra> obtenerCompras() {
		// TODO Auto-generated method stub
		return compras;
	}

}
