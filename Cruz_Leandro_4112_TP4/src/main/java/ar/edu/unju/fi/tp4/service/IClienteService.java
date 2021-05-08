package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.model.Cliente;

public interface IClienteService {
	
	public void generarTablaCLiente();
	public void guardarCliente(Cliente cliente);
	public List<Cliente> getAllClientes();
	public Cliente getCliente();

}
