package aplicacion.servicios;

import java.util.Scanner;
/**
 * Clase que implementa de la interfas de utilidades para escribir preguntas.
 * Captura pregunta.
 * @author Aaron
 *
 */
public class ImpUtils implements IntUtils {

	@Override
	public String CapturaPregunta(String txt) {
		//Boolean para comprobar si es true o para continuar o repetir
				boolean ok=true;
				String respuesta="aaaaaaa";
				Scanner pregunta = new Scanner (System.in);
				do {
					//Try para controlar 
				try {	
					//Pedimos un un mensage en txt personalizado para que la persona responda
					System.out.println(txt);
					respuesta=pregunta.next();
				
					
				}catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
					ok=false;
				}
				}while(!ok);
				return respuesta;
	}

}
