package trabajadores;

import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;

public class Directivo extends Empleado {
	private double bonus;

	public Directivo(String nombre, int edad, String numSegSocial,
			double sueldo, double bonus) throws EdadIlegalExcepcion, NombreNuloExcepcion {
		super(nombre, edad, numSegSocial, sueldo);
		this.bonus = bonus;		
	}	
	
	public String toString(){
		return super.toString() + " " + bonus;
	}
	
	@Override
	public double calcularSueldoMensual() {
		return super.calcularSueldoMensual() + bonus;
	}

}
