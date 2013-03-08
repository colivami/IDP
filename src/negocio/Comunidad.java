public class Comunidad { 
	
	
	private int ID;
	private int MaxRecibosPendientes;
	private String Calle;
	private Estado Estado_comunidad;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public Estado getEstado_comunidad() {
		return Estado_comunidad;
	}
	public void setEstado_comunidad(Estado estado_comunidad) {
		Estado_comunidad = estado_comunidad;
	}

}
