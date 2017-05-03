package trabajadores;

import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;

abstract public class Trabajador extends Persona {
	private String numSegSocial;

	public Trabajador(String nombre, int edad, 
			String numSegSocial) throws EdadIlegalExcepcion, NombreNuloExcepcion {
		super(nombre, edad);
		this.numSegSocial = numSegSocial;		
	}
	
	public String toString(){
		return super.toString() + " " + numSegSocial;
	}
	
	abstract public double calcularSueldoMensual();
	
}
