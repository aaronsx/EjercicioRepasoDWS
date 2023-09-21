package aplicacion.servicios;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Empleados;
/**
 * Clase que implementa de la interfas de emplado donde se realiza toda la funcion de la aplicacion.
 * Registar usuario,Modificar Empleado, Guardar en fichero. Contiene dos metodos privado que es calcular id y un metodo pregunta
 * 
 * 
 * @author Aaron
 *
 */
public class ImpEmpleados implements IntEmpleados {

	@Override
	public void RegistrarEmpleado(List<Empleados> bd) {
		
		Scanner preguntar = new Scanner(System.in);
		Empleados empleado=new Empleados();
		
		empleado.setIdEmpleado(calculoId(bd));
		
		System.out.println("Introduce el nombre del usuarios.");
		empleado.setNombre(preguntar.next());
		
		System.out.println("Introduce el apellido del usuarios.");
		empleado.setApellidos(preguntar.next());
		
		System.out.println("Introduce el dni del usuarios.");
		empleado.setDni(preguntar.next());
		
		System.out.println("Introduce la fecha de nacimiento del usuarios.");
		empleado.setFechaDeNacimiento(preguntar.next());
		
		System.out.println("Introduce la titulación mas alta del usuarios.");
		empleado.setTitulaciónMasAlta(preguntar.next());
		
		System.out.println("Introduce el numero de la seguirdad social del usuarios.");
		empleado.setNuSeguriSocial(preguntar.next());
		
		System.out.println("Introduce el numero de cuenta del usuarios.");
		empleado.setNuCuenta(preguntar.next());
		
		bd.add(empleado);
	}

	@Override
	public void ModificarEmpleado(List<Empleados> bd) {
		
		IntUtilsMenu menu=new ImpUtilsMenu();
		Scanner preguntar = new Scanner(System.in);
		boolean encontrado=false;
		System.out.println("Que id quieres editar:");
		for(Empleados empleado:bd)
		{
			System.out.println(empleado.getIdEmpleado());
		}
		do {
			int buscarid=preguntar.nextInt();
			
			
			for(Empleados emple : bd) 
			{
				
				if(buscarid==emple.getIdEmpleado()) 
				{
					
					
					//Si encuentra la id te pregunta si quieres editar todo o por partes
					if(MetodoSiono("Quieres editar todo el usuario Si/NO"))
					{
						System.out.println("Introduce el nombre del usuarios.");
						emple.setNombre(preguntar.next());
						
						System.out.println("Introduce el apellido del usuarios.");
						emple.setApellidos(preguntar.next());
						
						System.out.println("Introduce el dni del usuarios.");
						emple.setDni(preguntar.next());
						
						System.out.println("Introduce la fecha de nacimiento del usuarios.");
						emple.setFechaDeNacimiento(preguntar.next());
						
						System.out.println("Introduce la titulación mas alta del usuarios.");
						emple.setTitulaciónMasAlta(preguntar.next());
						
						System.out.println("Introduce el numero de la seguirdad social del usuarios.");
						emple.setNuSeguriSocial(preguntar.next());
						
						System.out.println("Introduce el numero de cuenta del usuarios.");
						emple.setNuCuenta(preguntar.next());
					}else
					{
						menu.MenuEditar();
						boolean cerrarmenu=false;
						do {
							int opcion=preguntar.nextInt();
							
							switch(opcion) 
							{
								case 1:
									System.out.println("Introduce el nombre del usuarios.");
									emple.setNombre(preguntar.next());
									break;
								case 2:
									System.out.println("Introduce el apellido del usuarios.");
									emple.setApellidos(preguntar.next());
									break;
								case 3:
									System.out.println("Introduce el dni del usuarios.");
									emple.setDni(preguntar.next());
									break;
								case 4:
									System.out.println("Introduce la fecha de nacimiento del usuarios.");
									emple.setFechaDeNacimiento(preguntar.next());
									break;
								case 5:
									System.out.println("Introduce la titulación mas alta del usuarios.");
									emple.setTitulaciónMasAlta(preguntar.next());
									break;
								case 6:
									System.out.println("Introduce la titulación mas alta del usuarios.");
									emple.setTitulaciónMasAlta(preguntar.next());
									break;
								case 7:
									System.out.println("Introduce el numero de la seguirdad social del usuarios.");
									emple.setNuSeguriSocial(preguntar.next());
									break;
								case 8:
									System.out.println("Introduce el numero de cuenta del usuarios.");
									emple.setNuCuenta(preguntar.next());
									break;
								case 0:
									cerrarmenu=true;
									break;
									default:
										System.out.println("Porfavor elige un numero");
								}
						}while(cerrarmenu);
					}	
					
					encontrado=true;
					break;
				}
				
			}
			if(!encontrado)	
				System.err.println("No se encontro ningun empleado con ese id");
			
		}while(!encontrado);
		
		
		
	}
	@Override
	public void GuardarEnFichero(List<Empleados> bd,File url) {
		int IdParaGuardar=0;
		Scanner preguntar = new Scanner(System.in);
		IntFicheros fichero=new ImpFicheros();
		if(!MetodoSiono("¿Quieres guardar todo los usuarios?"))
		{
			System.out.println("Que id Quieres guardar");
			for(Empleados empleado:bd)
			{
				System.out.println(empleado.toString());
				
			}
			
			IdParaGuardar=preguntar.nextInt();
			fichero.AbrirFicheroEscrito(url, bd, IdParaGuardar);
		}
		else
			fichero.AbrirFicheroEscrito(url, bd, IdParaGuardar);
			
			 
			
			
		
		
		
	}
	
	/**
	 * Método para calcular una id segun el tamaño de la lista.
	 * @param Una lista empleados.
	 * @return devuelve la id del empleado.
	 */
	private int calculoId(List<Empleados> bdAntigua) {
		//Calculamos ids
		int auxiliar = 0;
		for(int i = 0; i< bdAntigua.size(); i++) {
			int j = bdAntigua.get(i).getIdEmpleado();
			if(auxiliar<j) {
				auxiliar = j;
			}
		}
		return auxiliar + 1;
	}
	/**
	 * Método Preguntar si quieres hacer una interaccion o no.
	 * @param dos string uno para hacer la pregunta y captura la respuesta.
	 * @return devuelve un boolean.
	 */
	private boolean MetodoSiono(String txt) 
	{
		//Preguntar si o si no
		Scanner pregunta=new Scanner(System.in);
		String sioNo;
		boolean cerrarmenu=true;
		do {
			System.out.println(txt);
			  sioNo=pregunta.next().toLowerCase();
			  
			  switch(sioNo)
			  {
				  case "si":
					  return true;
				  case "no":
					  return false;
					default:
						System.err.println("***ERROR*** solo se puede si o no.");
						cerrarmenu=false;
			  }
			  
		}while(!cerrarmenu);
		return true;
		
	}

	

}
