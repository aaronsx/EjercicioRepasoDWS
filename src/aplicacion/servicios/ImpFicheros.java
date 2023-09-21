package aplicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import aplicacion.entidades.Empleados;
/**
 * Clase que implementa de una interfas que sirve para la gestion de ficheros.
 * Abrir fichero para escribir,Escribir en el fichero,Cerrar el fichero
 * Preparar el fichero,Escribir el encabezado.
 * @author Aaron
 *
 */
public class ImpFicheros implements IntFicheros {

	@Override
	public void AbrirFicheroEscrito(File archivo, List<Empleados> bd,int idEmpleado) {
		FileWriter fichero=null;
	      
        try
        {
        	//Te permite sobrescribir(por el true)
        	fichero = new FileWriter(archivo,true);


        } catch (Exception e) {
        	System.err.println("***ERROR***No se pudo abrir el fichero.");
        } 
        EscribirFichero(fichero,bd,idEmpleado);

	}

	@Override
	public void EscribirFichero(FileWriter fichero, List<Empleados> bd,int idEmpleado) {
		
		 try
	        {
			 	//Es el que escribe en las lineas(true es para que no se borre)
	        	PrintWriter pw= new PrintWriter(fichero,true);

	        	for(Empleados emple:bd) 
				 {
	        		if(idEmpleado==emple.getIdEmpleado())
	        		{
	        			pw.println(emple.getIdEmpleado()+";"+emple.getNombre()+";"+emple.getApellidos()+";"+emple.getTitulaciónMasAlta());
	        			break;
	        		}else if(idEmpleado==0)
	        			pw.println(emple.getIdEmpleado()+";"+emple.getNombre()+";"+emple.getApellidos()+";"+emple.getTitulaciónMasAlta());
				 }
	                
	        	
	        } catch (Exception e) {
	        	System.err.println("***ERROR***No se pudo escribir en el fichero.");
	        } finally {
	        	CerrarFichero(fichero);
	        }

	}

	@Override
	public void CerrarFichero(FileWriter fichero) {
		try {
	           
	           if (null != fichero)
	              fichero.close();
	           
	        }catch (Exception e2){
	        	   System.err.println("***ERROR***No se pudo cerrar el fichero.");
	            }
	}


	@Override
	public void PreparacionDeFichero(File archivo) {
		FileReader fr = null;
	      BufferedReader br = null;
		   try {
		        
			 //Se comprueba si existe el archivo y si no existe lo crea
			   
		         if(!archivo.exists())
		         {
		        	 
		        	 archivo.createNewFile();
		        	 EscirbirEncabezado(archivo);
		         }else {
		        	 //Contador para ver si esta escrito
		        	 fr = new FileReader (archivo);
			         br = new BufferedReader(fr);
		        	 String linea;
		        	 int contador=0;
			         while((linea=br.readLine())!=null)
			            contador++;
			         
			         if(contador==0||contador==1)
			        	 EscirbirEncabezado(archivo);
			        	 
		         }
		         
		        
		      }
		      catch(IOException e){
		    	  System.err.println("***ERROR***No se pudo aceder el fichero.");
		      }catch (Exception e) {
		        	System.err.println("***ERROR***Se ha producido un error.");
		        }
		   finally{
		         
		         try{ 
		        	 //if para 
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      }

	}

	@Override
	public void EscirbirEncabezado(File archivo) {
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	//Escribir el encabezado
            fichero = new FileWriter(archivo);
            
            pw = new PrintWriter(fichero);

                pw.println("nombre;apellidos;-;-;-;");

        }catch (IOException e) 
        {
        	System.err.println("***ERROR***No se pudo aceder el fichero.");
        } 
        catch (Exception e) {
        	System.err.println("***ERROR***Se ha producido un error.");
        } finally {
        	CerrarFichero(fichero);
        }
	}

}
