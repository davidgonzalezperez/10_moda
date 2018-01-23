package com.curso.prueba;

/*import com.curso.basico.Metro;*/
import com.curso.basico.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Hola");
		Persona p=new Persona();
		p.setNombre("Juan");
		p.setCiudad("Roma");
		p.setFacturacion(14.1f);
		Metro m=new Metro();
		
		System.out.println("el nombre es "+ p.getNombre());
		System.out.println("el nombre es "+ p.getCiudad());
		System.out.println("el nombre es "+ p.getFacturacion());
		
		System.out.println( m.consultar());
		System.out.println(m.horario());
		System.out.println(m.tarifa());
		
	}

}
