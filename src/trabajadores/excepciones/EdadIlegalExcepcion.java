package trabajadores.excepciones;

public class EdadIlegalExcepcion extends Exception {
	public EdadIlegalExcepcion() { }
	// si se quiere mostrar un cierto mensaje
	// se debe definir este segundo constructor
	public EdadIlegalExcepcion(String msg)  {
		super(msg);
	}
}
