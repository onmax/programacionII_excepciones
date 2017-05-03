package trabajadores.excepciones;

public class NombreNuloExcepcion extends Exception {
	public NombreNuloExcepcion() { }
	// si se quiere mostrar un cierto mensaje
	// se debe definir este segundo constructor
	public NombreNuloExcepcion(String msg)  {
		super(msg);
	}
}
