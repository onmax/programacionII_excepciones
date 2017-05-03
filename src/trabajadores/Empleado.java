package trabajadores;

import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;

public class Empleado extends Trabajador {
	private double sueldo;

	public Empleado(String nombre, int edad, 
			String numSegSocial, double sueldo) throws EdadIlegalExcepcion, NombreNuloExcepcion {
		super(nombre, edad, numSegSocial);
		this.sueldo = sueldo;		
	}
	
	public String toString(){
		return super.toString() + " " + sueldo;
	}

	@Override
	public double calcularSueldoMensual() {
		// TODO Auto-generated method stub
		return sueldo/14;
	}

}
