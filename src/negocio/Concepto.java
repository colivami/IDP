package negocio;

public class Concepto {
	
	private int ID_Concepto;
	private String ClaveConcepto;
	private String Descripcion;
	private int ID_LineaFactura;
	

	public int getID_Concepto() {
		return ID_Concepto;
	}
	public void setID_Concepto(int iD_Concepto) {
		ID_Concepto = iD_Concepto;
	}
	
	public String getClaveConcepto() {
		return ClaveConcepto;
	}
	public void setClaveConcepto(String claveConcepto) {
		ClaveConcepto = claveConcepto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getID_LineaFactura() {
		return ID_LineaFactura;
	}
	public void setID_LineaFactura(int iD_LineaFactura) {
		ID_LineaFactura = iD_LineaFactura;
	}
	
}
