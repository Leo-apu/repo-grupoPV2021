package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;

@Service
public class ProductoServiceImp implements IProductoService {
	
	@Autowired
	@Qualifier("unProducto")
	Producto producto;

	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);
	
	private List<Producto> productoList = new ArrayList<Producto>();
	
	@Override
	public void addProducto(Producto producto) {
        //agrego el objeto producto en la lista  de productos
		this.productoList.add(producto);
		LOGGER.info("METHOD: addProducto - se agrego un producto en la lista --> "+ productoList.get(productoList.size()-1));
	}

	@Override
	public Producto getUltimoProducto() {
		if (productoList.isEmpty()) {
			return producto;
			
		}else {
			Producto pr = productoList.get(productoList.size()-1);
			return pr;
		}
	}
	
	@Override
	public Producto getProducto() {
		return producto;
	}

	@Override
	public List<Producto> getAllProductos() {
		// TODO Auto-generated method stub
		return this.productoList;
	}
	

}
