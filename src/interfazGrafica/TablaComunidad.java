package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Comunidad;
import dao.ComunidadHome;

public class TablaComunidad extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ComunidadHome cHome = new ComunidadHome();
	
	public TablaComunidad() {
		super(null,new String[]{"ID Comunidad",
				"Calle", 
				"MaxRecibosPendientes",
				"Estado", 
				"ID Inmueble Presidente",
				"Cuadrado"});
	}
	
	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Comunidad c){
		Vector v=new Vector();
		v.add(c.getIdComunidad());
		v.add(c.getCalle());
		v.add(c.getMaxrecibospendientes());
		v.add(c.getEstado());
		v.add(c.getIdInmueblePresidente());
		v.add(c.getCuadrado());
		this.addRow(v);
	}
	
	public void addComunidad(Comunidad c) {
		this.addToTabla(c);
		cHome.anyadirComunidad(c);
	}
}
