package empresa;

import list.ArrayList;
import trabajadores.Directivo;
import trabajadores.Trabajador;

public class Empresa {
	private ArrayList<Trabajador> trabajadores;
	
	public Empresa(){
		trabajadores = new ArrayList<Trabajador>();
	}
	
	public void incluirEmpleado(Trabajador empleado){
		trabajadores.add(0, empleado);
	}
	
	/** POST: devolvemos en la pos 0 el no. de directivos que ganan menos
	 * de limInf euros, en la pos 1 el no. de directivos que ganan entre
	 * limInf y limSup y en la pos 2 el no. de directivos que ganan más de
	 * limSup
	 *  
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public int[] obtenerFrecuenciasSueldosDirectivos(double limInf, double limSup){
		int [] frecuenciasSueldos = new int[3];
		for(int i = 0; i<trabajadores.size(); i++){
			Trabajador trabajador = trabajadores.get(i);		
			if (trabajador instanceof Directivo){
				double sueldo = trabajador.calcularSueldoMensual();
				if(sueldo < limInf){
					frecuenciasSueldos[0] ++;
				}else if(limInf <= sueldo && sueldo <= limSup){
					frecuenciasSueldos[1] ++;
				}else{
					frecuenciasSueldos[2] ++;
				}
				
			}
		}
		return frecuenciasSueldos;
	}

	
	public static String toString(int [] arr){
		return arr[0] + " " + arr[1] + " " + arr[2];
	}
 
	
}
