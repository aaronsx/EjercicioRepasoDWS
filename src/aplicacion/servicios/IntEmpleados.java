package aplicacion.servicios;

import java.io.File;
import java.util.List;

import aplicacion.entidades.Empleados;
/**
 * Interfas donde va la cabezara de la funcion de la aplicacion.
 * @author Aaron
 *
 */
public interface IntEmpleados {
	
	/**
     * Método para registrar a un empleado.
     * @param Una lista Empleado.
     * @return 
     */
    public void RegistrarEmpleado(List<Empleados> bd);
     /**
      * Método para modicar un empleado.
      * @param Una lista Empleado.
      * @return 
      */
   public  void ModificarEmpleado(List<Empleados> bd);
   
   /**
    * Método para guardar en un fichero.
    * @param Una lista Empleado y un archivo File(Url).
    * @return 
    */
 public  void GuardarEnFichero(List<Empleados> bd,File archivo);
}
