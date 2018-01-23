package com.curso.comercio;

public class Minorista  extends Impuestos implements iComercio{
	
	private String nombre1="la mejore empresa";
	private String NIF="53478454F";
	
	
	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return "compra de minorista";
	}

	@Override
	public String vender() {
		// TODO Auto-generated method stub
		return "Venta de minorista";
	}

	@Override
	public String cobrar() {
		// TODO Auto-generated method stub
		return "Minorista cobrando...";
	}

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return "Minorista paga 10 euros";
	}

}
