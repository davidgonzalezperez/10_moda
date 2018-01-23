package com.curso.basico;

public  class Persona {

	private String nombre;
	private String ciudad;
	private float facturacion;

	
	
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public float getFacturacion() {
		return facturacion;
	}
	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}
	
	
}
