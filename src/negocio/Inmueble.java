package negocio;

public class Inmueble {
	
	private int ID_Inmueble;
	private String Escalera;
	private String Piso;
	private String Puerta;
	private Float Porcentaje;

	

	public int getID_Inmueble() {
		return ID_Inmueble;
	}
	public void setID_Inmueble(int iD_Inmueble) {
		ID_Inmueble = iD_Inmueble;
	}
	
	public String getEscalera() {
		return Escalera;
	}
	public void setEscalera(String escalera) {
		Escalera = escalera;
	}
	public String getPiso() {
		return Piso;
	}
	public void setPiso(String piso) {
		Piso = piso;
	}
	public String getPuerta() {
		return Puerta;
	}
	public void setPuerta(String puerta) {
		Puerta = puerta;
	}

	public Float getPorcentaje() {
		return Porcentaje;
	}
	public void setPorcentaje(Float porcentaje) {
		Porcentaje = porcentaje;
	}
	
	
}
