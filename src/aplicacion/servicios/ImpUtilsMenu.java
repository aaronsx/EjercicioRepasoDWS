package aplicacion.servicios;
/**
 * Clase que implementa de una interfas que sirve para mostrar menu.
 * Menu,Menu editar
 * @author Aaron
 *
 */
public class ImpUtilsMenu implements IntUtilsMenu {

	@Override
	public void Menu() {
		// TODO Auto-generated method stub
		System.out.println("<-----------Menu------------->");
		System.out.println("1. Insertar empleado");
		System.out.println("2. Modificar empleado");
		System.out.println("2. Guardar empleado");
		System.out.println("0. Salir");
	}

	@Override
	public void MenuEditar() {
	
		System.out.println("<---------Que quieres editar----------->");
		System.out.println("1-nombre");
		System.out.println("2-apellido");
		System.out.println("3-Dni");
		System.out.println("4-Fecha de nacimiento");
		System.out.println("5-Dni");
		System.out.println("6-Fecha de nacimiento");
		System.out.println("7-Numero de la seguirdad social");
		System.out.println("8-Numero de cuenta");
		System.out.println("0-Salir");

	}

}
