package com.curso.moda;

public class Dietista extends Persona {

	public String Dieta;
	
	public String Preparar() {
		return "Preparando la dieta";
	}
	public Dietista(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
		super(string, string2, string3, string4);
		this.Dieta = string5;
	}
}
