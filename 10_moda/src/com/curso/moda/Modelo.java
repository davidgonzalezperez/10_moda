package com.curso.moda;

public class Modelo extends Persona{

	public String habilidad;

	public String practicar() {
		return "practicando";
	}
	public Modelo(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
		super(string, string2, string3, string4);
		this.habilidad = string5;
	}
	
}
