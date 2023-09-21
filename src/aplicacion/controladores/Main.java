package aplicacion.controladores;


import java.io.File;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

import aplicacion.entidades.Empleados;
import aplicacion.servicios.ImpFicheros;
import aplicacion.servicios.ImpUtilsMenu;
import aplicacion.servicios.ImpEmpleados;
import aplicacion.servicios.IntFicheros;
import aplicacion.servicios.IntUtilsMenu;
import aplicacion.servicios.IntEmpleados;

public class Main {
	/**
	 * Clase por la que se entra a la aplicación que contiene el main. 
	 * En ella solo estan definidos los pasos y el procedimiento de ejecución que sigue la aplicación.
	 * @author Aaron
	 *
	 */
	public static void main(String[] args) {
		IntUtilsMenu menu=new ImpUtilsMenu();
		IntEmpleados emple=new ImpEmpleados();
		IntFicheros fichero=new ImpFicheros();
		List<Empleados> bd=new ArrayList<>();
		
		Boolean cerrarMenu = false; 
		//Se guarda la ruta del fichero y lo guarda en un File llamado archivo
		File archivo = new File ("C:\\Users\\Puesto2\\Desktop\\Clase\\DIW\\EjercicioRepasoDIW.txt");
		//LLama para la preparacion de los ficheros
		fichero.PreparacionDeFichero(archivo); 
		 int opcion=0;
	
		
		
				while(!cerrarMenu) 
				{	
					try {
						 Scanner preguntar=new Scanner(System.in);
						//Mostramos el menú
						menu.Menu();
						System.out.println("Introduza la opción deseada: ");
						opcion = preguntar.nextInt();
						if(opcion>=0 && opcion<=3)
						{
							System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
						}
						//Segun la opcion de hace llama a insertar Usuario o Abrir el fichero
						switch (opcion) 
						{			
							case 1:
								
								emple.RegistrarEmpleado(bd);
								break;
							
							case 2:
								emple.ModificarEmpleado(bd);
								break;
								
							case 3:
								emple.GuardarEnFichero(bd, archivo);
								break;
							
							
							case 0:
								JOptionPane.showMessageDialog(null,"¡Gracias por visitar nuestra Empresa!");
								cerrarMenu = true;
								break;
							default:
								System.err.println("Solo se puede del 0 al 2");
						}
				}catch(InputMismatchException e) {
					System.err.println("***ERROR***No has introducido un entero");
				}
				catch(NullPointerException e) {
					System.err.println("***ERROR***No lo puedes dejar nuelo");
				}
				catch(Exception e) {
					System.err.println("***ERROR***Se ha surgido otro error");

				 }
					
				}

	}

}
