package com.curso.comercio;

public abstract class Impuestos {
	
	private float iva=1.21f;
	private float iva2=1.11f;
	
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getIva2() {
		return iva2;
	}
	public void setIva2(float iva2) {
		this.iva2 = iva2;
	}
	
	
}
