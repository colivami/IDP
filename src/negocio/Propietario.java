// default package
// Generated Mar 21, 2013 11:01:57 AM by Hibernate Tools 3.4.0.CR1

/**
 * Propietario generated by hbm2java
 */
public class Propietario implements java.io.Serializable {

	private int id;
	private Inmueble inmueble;
	private String nif;
	private String nombre;
	private String direccion;
	private String poblacion;
	private String telefono;
	private String observaciones;
	private String fechaalta;

	public Propietario() {
	}

	public Propietario(int id, Inmueble inmueble) {
		this.id = id;
		this.inmueble = inmueble;
	}

	public Propietario(int id, Inmueble inmueble, String nif, String nombre,
			String direccion, String poblacion, String telefono,
			String observaciones, String fechaalta) {
		this.id = id;
		this.inmueble = inmueble;
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.observaciones = observaciones;
		this.fechaalta = fechaalta;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return this.poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFechaalta() {
		return this.fechaalta;
	}

	public void setFechaalta(String fechaalta) {
		this.fechaalta = fechaalta;
	}

}
