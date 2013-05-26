package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Reciboinmueble;
import dao.ReciboinmuebleHome;

public class TablaRecibosPropietario extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReciboinmuebleHome riHome = new ReciboinmuebleHome();
	
	public TablaRecibosPropietario() {
		super(null,new String[]{"ID Reciboinmueble",
				"Importe",
				"Fecha pago",
				"ID Inmueble",
				"ID Nota informativa",
				"ID Carta",
				"Pagado?"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Reciboinmueble ri){
		Vector v=new Vector();
		v.add(ri.getIdReciboinmueble());
		v.add(ri.getFechapago());
		v.add(ri.getImporte());
		v.add(ri.getInmueble().getIdInmueble());
		v.add(ri.getNotainformativa().getIdNotainformativa());
		v.add(ri.getCarta().getIdCarta());
		v.add(ri.getPagado());
		this.addRow(v);
	}
	
	public void addReciboinmueble(Reciboinmueble ri) {
		this.addToTabla(ri);
	}

}
