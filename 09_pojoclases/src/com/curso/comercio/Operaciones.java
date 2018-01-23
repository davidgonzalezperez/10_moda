package com.curso.comercio;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Minorista mi=new Minorista();
		Mayorista ma=new Mayorista();
		
		System.out.println(mi.comprar()+" "+ mi.getIva());
		System.out.println(mi.cobrar());
		
	
		
	}
 
}
