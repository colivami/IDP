package interfazGrafica;

import javax.swing.WindowConstants;

public class gestionInmueblesGUI extends javax.swing.JFrame {

	
	public gestionInmueblesGUI() {
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
