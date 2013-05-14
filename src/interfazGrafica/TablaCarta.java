package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Carta;
import dao.CartaHome;

public class TablaCarta extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CartaHome carHome = new CartaHome();
	
	public TablaCarta() {
		super(null,new String[]{"ID Carta", "Fecha"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Carta c){
		Vector v=new Vector();
		v.add(c.getIdCarta());
		v.add(c.getFecha());
		this.addRow(v);
	}
	
	public void addCarta(Carta c) {
		this.addToTabla(c);
		carHome.anyadirCarta(c);
	}


}
