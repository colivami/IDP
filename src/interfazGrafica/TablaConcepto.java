package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Concepto;
import dao.ConceptoHome;

public class TablaConcepto extends DefaultTableModel{

	private static final long serialVersionUID = 1L;
	private ConceptoHome cHome = new ConceptoHome();
	

	public TablaConcepto() {
		super(null,new String[]{"ID Concepto",
				"Descripción"});
	}
	

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Concepto c){
		Vector v=new Vector();
		v.add(c.getIdConcepto());
		v.add(c.getDescripcion());
		this.addRow(v);
	}
	
	public void addConcepto(Concepto c) {
		this.addToTabla(c);
		cHome.anyadirConcepto(c);
	}

}
