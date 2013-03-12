
package negocio;

public class LineaFactura {
	
	private int ID;
	private float ImporteLinea;
	private String Observacion;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public float getImporteLinea() {
		return ImporteLinea;
	}
	public void setImporteLinea(float importeLinea) {
		ImporteLinea = importeLinea;
	}
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}
	
}
