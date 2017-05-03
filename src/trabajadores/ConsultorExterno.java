package trabajadores;

import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;

public class ConsultorExterno extends Trabajador {
	private double tarifa;
	private double horas;
	private String empresa;
	
	public ConsultorExterno(String nombre, int edad, String numSegSocial,
			double tarifa, double horas, String empresa) throws EdadIlegalExcepcion, NombreNuloExcepcion {
		super(nombre, edad, numSegSocial);
		this.tarifa = tarifa;
		this.horas = horas;
		this.empresa = empresa;		
	}
	
	public String toString(){
		return super.toString() + " " + tarifa + " " + horas +
		" " + empresa;
	}

	@Override
	public double calcularSueldoMensual() {
		// TODO Auto-generated method stub
		return tarifa*horas;
	}
	

}
