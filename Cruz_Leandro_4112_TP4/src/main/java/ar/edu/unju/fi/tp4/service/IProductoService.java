package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Producto;

public interface IProductoService {
	//14-5 VDE
	public void generarTablaProducto();

	public void addProducto(Producto producto);
	
	public Producto getUltimoProducto();
	
	public Producto getProducto();
	
	public List<Producto> getAllProductos();
	//14-5 VDE
	public Producto getUnProducto(int codigo);
}
