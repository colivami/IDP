
package negocio;

public class LineaFactura {
	
	private int ID_Linea_Factura;
	private float ImporteLinea;
	private String Observacion;
	private int NumFactura;
	
	

	public int getID_Linea_Factura() {
		return ID_Linea_Factura;
	}
	public void setID_Linea_Factura(int iD_Linea_Factura) {
		ID_Linea_Factura = iD_Linea_Factura;
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
	public int getNumFactura() {
		return NumFactura;
	}
	public void setNumFactura(int numFactura) {
		NumFactura = numFactura;
	}
}
