package interfazGrafica;

import javax.swing.table.DefaultTableModel;

import negocio.Inmueble;

public class TablaInmueble extends DefaultTableModel {

	private Inmueble inm;
	private boolean inmVacio;
	private boolean modified = false;

	public TablaInmueble(Inmueble inm) {
		super(null,new String[]{"ID Inmueble",
				"Escalera", 
				"Piso", 
				"Puerta", 
				"Porcentaje", 
				"ID Comunidad"});
		this.inm = inm;
		inmVacio = false;

	}
}
