package interfazGrafica;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Inmueble;
import dao.InmuebleHome;

public class TablaInmueble extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InmuebleHome iHome = new InmuebleHome();
	private ArrayList<Inmueble> inmuebles = iHome.buscarInmuebles();
	private boolean inmVacio;
	private boolean modified = false;

	public TablaInmueble() {
		super(null,new String[]{"ID Inmueble",
				"Escalera", 
				"Piso", 
				"Puerta", 
				"Porcentaje", 
				"ID Comunidad",
				"ID Propietario",
				"ID Datos Bancarios"});
		
		for(Inmueble i : inmuebles) {
			addToTabla(i);
		}
		inmVacio = false;
	}
	
//	public Inmueble recuperarInmueblePorPosicion(int row) {
//		iHome.
//		
//		return i;
//	}
	
	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}
	
	public boolean isInmVacio() {
		return inmVacio;
	}

	public void setInmVacio(boolean inmVacio) {
		this.inmVacio = inmVacio;
	}
	
	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void addToTabla(Inmueble i){
		Vector v=new Vector();
		v.add(i.getIdInmueble());
		v.add(i.getEscalera());
		v.add(i.getPiso());
		v.add(i.getPuerta());
		v.add(i.getPorcentaje());
//		v.add(i.getComunidad().getIdComunidad());
//		v.add(i.getPropietario().getIdPropietario());
//		v.add(i.getDatosbancarios().getIdDatosbancarios());
		this.addRow(v);
	}
	
	public void addInmueble(Inmueble i) {
		this.addToTabla(i);
		iHome.anyadirInmueble(i);
	}

}
