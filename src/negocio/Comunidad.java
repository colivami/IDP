package negocio;

public class Comunidad { 
	
	private int ID_Comunidad;
	private String Calle;
	private int MaxRecibosPendientes;
	private Estados Estado;
	private int ID_Inmueble;
	private int ID_Inmueble_Presidente;
	
	public int getID_Comunidad() {
		return ID_Comunidad;
	}
	public void setID_Comunidad(int iD_Comunidad) {
		ID_Comunidad = iD_Comunidad;
	}
	

	public int getMaxRecibosPendientes() {
		return MaxRecibosPendientes;
	}
	public void setMaxRecibosPendientes(int maxRecibosPendientes) {
		MaxRecibosPendientes = maxRecibosPendientes;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public Estados getEstado() {
		return Estado;
	}
	public void setEstado(Estados estado) {
		Estado = estado;
	}
	public int getID_Inmueble() {
		return ID_Inmueble;
	}
	public void setID_Inmueble(int iD_Inmueble) {
		ID_Inmueble = iD_Inmueble;
	}
	public int getID_Inmueble_Presidente() {
		return ID_Inmueble_Presidente;
	}
	public void setID_Inmueble_Presidente(int iD_Inmueble_Presidente) {
		ID_Inmueble_Presidente = iD_Inmueble_Presidente;
	}


}
