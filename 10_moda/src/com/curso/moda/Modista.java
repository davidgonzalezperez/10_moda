package com.curso.moda;

public class Modista extends Persona{

	
	public String empresa;
	public String experiencia;
	
	public Modista(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
		super(string, string2, string3, string4);
		this.empresa = string5;
		this.experiencia = string6;
	}

	public String disenar() {
		return "diseñando";
	}
}
