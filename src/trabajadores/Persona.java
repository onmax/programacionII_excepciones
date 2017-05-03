package trabajadores;

import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;

public class Persona {
	private String nombre;
	private int edad;

	
	public Persona(String nombre, int edad) throws EdadIlegalExcepcion, NombreNuloExcepcion {	
		if(nombre == null){
			throw new NombreNuloExcepcion ();
		}else{
			this.nombre = nombre;
		}
		if(edad < 18){
			throw new EdadIlegalExcepcion();
		}else{
			this.edad = edad;
		}
	}
	
	public String toString(){
		return nombre + " " + edad;
	}
}

