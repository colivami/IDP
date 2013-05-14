package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Lineafactura;
import dao.LineafacturaHome;

public class TablaLineaFactura extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LineafacturaHome lfHome = new LineafacturaHome();
	
	public TablaLineaFactura() {
		super(null,new String[]{"ID LineaFactura", "Importe", "Observacion", "Num factura", "ID Concepto"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Lineafactura lf){
		Vector v=new Vector();
		v.add(lf.getIdLineafactura());
		v.add(lf.getImportelinea());
		v.add(lf.getObservacion());
		v.add(lf.getFactura().getNumfactura());
		v.add(lf.getConcepto().getIdConcepto());
		this.addRow(v);
	}
	
	public void addLineaFactura(Lineafactura lf) {
		this.addToTabla(lf);
		lfHome.anyadirLineafactura(lf);
	}


}
