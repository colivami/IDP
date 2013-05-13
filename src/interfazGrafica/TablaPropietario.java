package interfazGrafica;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Propietario;
import dao.PropietarioHome;

public class TablaPropietario extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PropietarioHome pHome = new PropietarioHome();
	
	public TablaPropietario() {
		super(null,new String[]{"ID Propietario", "NIF", "Nombre", "Dirección", "Población", "Teléfono", "Observaciones", "Fecha de alta"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Propietario p){
		Vector v=new Vector();
		v.add(p.getIdPropietario());
		v.add(p.getNombre());
		v.add(p.getDireccion());
		v.add(p.getPoblacion());
		v.add(p.getTelefono());
		v.add(p.getObservaciones());
		v.add(p.getFechaalta());
		this.addRow(v);
	}
	
	public void addPropietario(Propietario p) {
		this.addToTabla(p);
		pHome.anyadirPropietario(p);
	}
}
