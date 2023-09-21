package aplicacion.entidades;
/**
 * Clase donde esta declarada las entidades.Atributos,Getters y setters
 * @author Aaron
 *
 */
public class Empleados {
	 //---------Atributos-----------
	private int idEmpleado = 0;
	private String nombre="aaaaaa";
	private String apellidos = "aaaaaa";
    private String dni = "aaaaaa";
    private String fechaDeNacimiento = "aaaaaa";
    private String titulaciónMasAlta = "aaaaaa";
    private String nuSeguriSocial = "aaaaaa";
    private String nuCuenta = "aaaaaa";
    //--------Getters Y Setters---------
    public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getTitulaciónMasAlta() {
		return titulaciónMasAlta;
	}
	public void setTitulaciónMasAlta(String titulaciónMasAlta) {
		this.titulaciónMasAlta = titulaciónMasAlta;
	}
	
	public String getNuSeguriSocial() {
		return nuSeguriSocial;
	}
	public void setNuSeguriSocial(String nuSeguriSocial) {
		this.nuSeguriSocial = nuSeguriSocial;
	}
	
	public String getNuCuenta() {
		return nuCuenta;
	}
	public void setNuCuenta(String nuCuenta) {
		this.nuCuenta = nuCuenta;
	}
	
	public String toString() {
		return "Empleado [id=" + idEmpleado + " |Nombre=" + nombre +" "+ apellidos + " |Fecha de nacimiento= " + fechaDeNacimiento+ " |Titulo= " + titulaciónMasAlta
				+ " |dni= " + dni + " |Numero Seguridad Social=" + nuSeguriSocial + " |Numero Cuenta=" + nuCuenta +"]";
	}
}
