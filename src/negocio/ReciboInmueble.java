
package negocio;

public class ReciboInmueble {
	private int ID_Recibo_Inmueble;
	private String FechaPago;
	private float Importe;
	private int ID_Inmueble;
	private int ID_Nota_Informativa;
	
	
	public int getID_Recibo_Inmueble() {
		return ID_Recibo_Inmueble;
	}
	public void setID_Recibo_Inmueble(int iD_Recibo_Inmueble) {
		ID_Recibo_Inmueble = iD_Recibo_Inmueble;
	}
	public int getID_Inmueble() {
		return ID_Inmueble;
	}
	public void setID_Inmueble(int iD_Inmueble) {
		ID_Inmueble = iD_Inmueble;
	}
	public int getID_Nota_Informativa() {
		return ID_Nota_Informativa;
	}
	public void setID_Nota_Informativa(int iD_Nota_Informativa) {
		ID_Nota_Informativa = iD_Nota_Informativa;
	}
	public String getFechaPago() {
		return FechaPago;
	}
	public void setFechaPago(String fechaPago) {
		FechaPago = fechaPago;
	}
	public float getImporte() {
		return Importe;
	}
	public void setImporte(float importe) {
		Importe = importe;
	}
	
}
