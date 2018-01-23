package com.curso.moda;

public class Persona implements IAcciones {
	
	
	public String id;
	public String nombre;
	public String apellidos;
	public String edad;
	
	
	public Persona(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		this.id = string;
		this.nombre = string2;
		this.apellidos = string3;
		this.edad = string4;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	
	
	
	@Override
	public String desfilar() {
		// TODO Auto-generated method stub
		return "Desfilando";
	}

	@Override
	public String planificar() {
		// TODO Auto-generated method stub
		return "Planificando";
	}

	@Override
	public String viajar() {
		// TODO Auto-generated method stub
		return "viajando";
	}

}
