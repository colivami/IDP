package interfazGrafica;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class GestionPropietariosGUI extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionPropietariosGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
