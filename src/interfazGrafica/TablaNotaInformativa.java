package interfazGrafica;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import negocio.Notainformativa;
import dao.NotainformativaHome;

public class TablaNotaInformativa extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NotainformativaHome niHome = new NotainformativaHome();
	
	public TablaNotaInformativa() {
		super(null,new String[]{"ID NotaInformativa", "Fecha calculo", "Importe", "ID Comunidad"});
	}

	public boolean isCellEditable(int rowindex, int colindex) {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void addToTabla(Notainformativa ni){
		Vector v=new Vector();
		v.add(ni.getIdNotainformativa());
		v.add(ni.getFechacalculo());
		v.add(ni.getImportenota());
		v.add(ni.getComunidad().getIdComunidad());
		this.addRow(v);
	}
	
	public void addNotaInformativa(Notainformativa ni) {
		this.addToTabla(ni);
		niHome.anyadirNotaInformativa(ni);
	}

}
