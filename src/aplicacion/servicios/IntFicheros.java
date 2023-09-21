package aplicacion.servicios;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import aplicacion.entidades.Empleados;
/**
 * Interfas donde va la cabezara de la gestion de ficheros.
 * @author Aaron
 *
 */
public interface IntFicheros {
	/**
	 * Método Abrir fichero escrito
	 * @param Un Archivo File(Url), una lista y un string con la id
	 * 
	 */
	public void AbrirFicheroEscrito(File archivo, List<Empleados> bd,int idEmpleado);
	
	/**
	 * Método Escribir en fichero
	 * @param Un Archivo FileWriter para escribir, una lista y un string con la id
	 * 
	 */
	public void EscribirFichero(FileWriter fichero, List<Empleados> bd,int idEmpleado);

	/**
	 * Método Cerrar el fichero escrito
	 * @param Un Archivo FileWriter para cerrar
	 * 
	 */
	public void CerrarFichero(FileWriter fichero);


	/**
	 * Método Perarcion del fichero principal
	 * @param Un Archivo File(Direccion del proyecto)
	 * 
	 */
	public void PreparacionDeFichero(File archivo);

	/**
	 * Método Encabezado del texto
	 * @param Un Archivo File(Direccion del proyecto)
	 *  
	 */
	public void EscirbirEncabezado(File archivo);
}
