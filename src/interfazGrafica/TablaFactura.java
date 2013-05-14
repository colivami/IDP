package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Factura;
import dao.FacturaHome;

public class TablaFactura extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FacturaHome fHome = new FacturaHome();
	
	public TablaFactura() {
		super(null,new String[]{"Num Factura", "ID Comunidad", "Fecha", "ID Nota Informativa"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Factura f){
		Vector v=new Vector();
		v.add(f.getNumfactura());
		v.add(f.getComunidad().getIdComunidad());
		v.add(f.getFechafactura());
		v.add(f.getNotainformativa().getIdNotainformativa());
		this.addRow(v);
	}
	
	public void addFactura(Factura f) {
		this.addToTabla(f);
		fHome.anyadirFactura(f);
	}
}
