package com.curso.basico;

public class Metro implements iTransporte {

	@Override
	public String consultar() {
		// TODO Auto-generated method stub
		return "Necesitas tarjeta de transporte";
	}

	@Override
	public String horario() {
		// TODO Auto-generated method stub
		return "De 06:00 - 13:30h";
	}

	@Override
	public float tarifa() {
		// TODO Auto-generated method stub
		return 50f;
	}

}
