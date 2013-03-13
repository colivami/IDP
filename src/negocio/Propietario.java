
package negocio;

public class Propietario {
	
	private int ID;
	private String NIF;
	private String Nombre;
	private String Direccion;
	private String Poblacion;
	private String Telefono;
	private String Observaciones;
	private String FechaAlta;
	private int ID_Inmueble;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getPoblacion() {
		return Poblacion;
	}
	public void setPoblacion(String poblacion) {
		Poblacion = poblacion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getFechaAlta() {
		return FechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		FechaAlta = fechaAlta;
	}
	public int getID_Inmueble() {
		return ID_Inmueble;
	}
	public void setID_Inmueble(int iD_Inmueble) {
		ID_Inmueble = iD_Inmueble;
	}
	
}
