
package negocio;

public class NotaInformativa {
	
	private int ID_Nota_Informativa;
	private String FechaCalculo;
	private float ImporteNota;
	private int Num_Factura;
	
	

	public int getID_Nota_Informativa() {
		return ID_Nota_Informativa;
	}
	public void setID_Nota_Informativa(int iD_Nota_Informativa) {
		ID_Nota_Informativa = iD_Nota_Informativa;
	}

	public String getFechaCalculo() {
		return FechaCalculo;
	}
	public void setFechaCalculo(String fechaCalculo) {
		FechaCalculo = fechaCalculo;
	}
	public float getImporteNota() {
		return ImporteNota;
	}
	public void setImporteNota(float importeNota) {
		ImporteNota = importeNota;
	}
	
	public int getNum_Factura() {
		return Num_Factura;
	}
	public void setNum_Factura(int num_Factura) {
		Num_Factura = num_Factura;
	}
}
