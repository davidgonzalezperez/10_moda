package com.curso.comercio;

public class Mayorista extends Impuestos implements iComercio  {

	private String nombreEmpresa="las mejores empresas";
	private String CIF="";
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	@Override
	public String comprar() {
		// TODO Auto-generated method stub
		return "compra de mayorista";
	}

	@Override
	public String vender() {
		// TODO Auto-generated method stub
		return "Venta de mayorista";
	}

	@Override
	public String cobrar() {
		// TODO Auto-generated method stub
		return "Mayorista cobrando...";
	}

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return "mayorista paga 8,20 euros";
	}

}
