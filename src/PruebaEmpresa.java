import trabajadores.Directivo;
import trabajadores.Empleado;
import trabajadores.excepciones.EdadIlegalExcepcion;
import trabajadores.excepciones.NombreNuloExcepcion;
import empresa.Empresa;
import trabajadores.ConsultorExterno;

public class PruebaEmpresa {
	public static void main (String [] args){
		Empresa empresa = new Empresa(); 
		
		
		try{
			empresa.incluirEmpleado(new Directivo("Juan", 25, "001122", 10000, 500));
			
			empresa.incluirEmpleado(new Directivo("Pedro", 47, "001122", 12000, 1000));
			
			empresa.incluirEmpleado(new Directivo("Ana", 55, "001122", 11000, 200));
			
			empresa.incluirEmpleado(new Directivo("Maria", 19, "001122", 10000, 150));
			
			empresa.incluirEmpleado(new Directivo("Julia", 33, "001122", 12000, 200));
			
			empresa.incluirEmpleado(new ConsultorExterno("Francisco", 32, "001122", 2000, 15, "empresa1"));
					
			empresa.incluirEmpleado(new ConsultorExterno("Ramón", 41, "001122", 3000, 17, "empresa2"));
			
			empresa.incluirEmpleado(new Empleado("Rodrigo", 28, "001122", 6500));
			
			empresa.incluirEmpleado(new Empleado("Gema María", 35, "001122", 7500));
			
			empresa.incluirEmpleado(new Empleado("Luis", 51, "001122", 5000));
		}catch(EdadIlegalExcepcion | NombreNuloExcepcion e){
			e.printStackTrace();
		}
		
		System.out.println(empresa.toString(empresa.obtenerFrecuenciasSueldosDirectivos(1000, 1100)));
		System.out.println("Fin de programa");
		
	}
}
