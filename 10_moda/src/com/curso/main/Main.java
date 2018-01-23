package com.curso.main;

import java.util.ArrayList;

import com.curso.moda.*;

public class Main {
	public static ArrayList<Persona> integrantes = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Modista md=new Modista("1", "Vicente", "Del Bosque", "60", "28489","2");
		Modelo mod=new Modelo("2", "roberto", "de la rosa", "60", "28489");
		Dietista die=new Dietista("3", "antonio", "fernandez", "60", "28489");
	

 
	integrantes.add(md);
	integrantes.add(mod);
	integrantes.add(die);
	
	
	
	System.out.println("Comienza el Desfile.");
	for (Persona integrante : integrantes) {
		System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
		System.out.print(integrante.desfilar()+"\n");
	}
	System.out.println("Comienza el Viaje.");
	for (Persona integrante : integrantes) {
		System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
		System.out.print(integrante.viajar()+"\n");
	
}
	System.out.println("Comienza la planificacion.");
	for (Persona integrante : integrantes) {
		System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> "+integrante.planificar()+"\n");
	}
	System.out.println(md.disenar());
	System.out.println(mod.desfilar());
	System.out.println(die.Preparar());
	
	}
	
	
	
}

