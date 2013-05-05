package interfazGrafica;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Comunidad;
import negocio.Inmueble;
import dao.ComunidadHome;

public class TablaComunidad extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ComunidadHome cHome = new ComunidadHome();
	private ArrayList<Comunidad> comunidades = cHome.buscarComunidades();
	
	public TablaComunidad() {
		super(null,new String[]{"ID Comunidad",
				"Calle", 
				"MaxRecibosPendientes", 
				"Estado", 
				"ID Inmueble Presidente"});
		
		for(Comunidad i : comunidades) {
			addToTabla(i);
		}
	}
	
//	
//	public boolean isModified() {
//		return modified;
//	}
//
//	public void setModified(boolean modified) {
//		this.modified = modified;
//	}
//	
//	public boolean isInmVacio() {
//		return inmVacio;
//	}
//
//	public void setInmVacio(boolean inmVacio) {
//		this.inmVacio = inmVacio;
//	}
//	
	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void addToTabla(Comunidad c){
		Vector v=new Vector();
		v.add(c.getIdComunidad());
		v.add(c.getCalle());
		v.add(c.getMaxrecibospendientes());
		v.add(c.getEstado());
		v.add(c.getIdInmueblePresidente());
		this.addRow(v);
	}
	
	public void addComunidad(Comunidad c) {
		this.addToTabla(c);
		cHome.anyadirComunidad(c);
	}
}
