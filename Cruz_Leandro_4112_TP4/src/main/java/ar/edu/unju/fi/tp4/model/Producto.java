package ar.edu.unju.fi.tp4.model;

import org.springframework.stereotype.Component;

@Component("unProducto")
public class Producto {
	 private int codigo;
	 private String nombre;
	 private Double precio;
	 private String marca;
	 private int stock;
	 
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Producto [Codigo= " + codigo + "\nNombre= " + nombre + "\nPrecio= " + precio + "\nMarca= " + marca
				+ "\nStock= " + stock + "]";
	}
	
	
	
}