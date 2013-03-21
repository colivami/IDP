package interfazGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import negocio.Inmueble;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class GestionInmueblesGUI extends javax.swing.JFrame {
	private JLabel jL_IDInmuebles;
	private JLabel jL_PisoInmuebles;
	private JLabel jLabel1;
	private JButton jB_CancelarInmuebles;
	private JButton jB_GuardarInmuebles;
	private JTextField jTF_PorcentajeInmuebles;
	private JTextField jTF_PuertaInmuebles;
	private JTextField jTF_PisoInmuebles;
	private JTextField jTF_EscaleraInmuebles;
	private JTextField jTF_IDComunidadInmueble;
	private JTextField jTF_IDInmuebles;
	private JLabel jL_PorcentajeInmuebles;
	private JLabel jL_PuertaInmuebles;
	private JLabel jL_EscaleraInmuebles;
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionInmueblesGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Inmuebles");
			{
				jL_IDInmuebles = new JLabel();
				jL_IDInmuebles.setText("ID");
			}
			{
				jL_EscaleraInmuebles = new JLabel();
				jL_EscaleraInmuebles.setText("Escalera");
			}
			{
				jL_PisoInmuebles = new JLabel();
				jL_PisoInmuebles.setText("Piso");
			}
			{
				jL_PuertaInmuebles = new JLabel();
				jL_PuertaInmuebles.setText("Puerta");
			}
			{
				jL_PorcentajeInmuebles = new JLabel();
				jL_PorcentajeInmuebles.setText("Porcentaje");
			}
			{
				jTF_PorcentajeInmuebles = new JTextField();
			}
			{
				jTF_PuertaInmuebles = new JTextField();
			}
			{
				jTF_PisoInmuebles = new JTextField();
			}
			{
				jTF_IDInmuebles = new JTextField();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("ID Comunidad");
			}
			{
				jTF_IDComunidadInmueble = new JTextField();
			}
			{
				jB_GuardarInmuebles = new JButton();
				jB_GuardarInmuebles.setText("Guardar");
				jB_GuardarInmuebles.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarInmueblesActionPerformed(evt);
					}
				});
			}
			{
				jB_CancelarInmuebles = new JButton();
				jB_CancelarInmuebles.setText("Cancelar");
				jB_CancelarInmuebles.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarInmueblesActionPerformed(evt);
					}
				});
			}
			{
				jTF_EscaleraInmuebles = new JTextField();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDComunidadInmueble, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_IDInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_EscaleraInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_EscaleraInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_PisoInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_PisoInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_PuertaInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_PuertaInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_PorcentajeInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_PorcentajeInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jB_GuardarInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jB_CancelarInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap());
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(42, 42)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jL_PorcentajeInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_PuertaInmuebles, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				        .addGap(91))
				    .addComponent(jL_PisoInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_EscaleraInmuebles, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				        .addGap(91))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_IDInmuebles, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				        .addGap(91))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
				        .addGap(39))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(24)
				        .addComponent(jB_GuardarInmuebles, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(30)))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jB_CancelarInmuebles, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 25, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_PorcentajeInmuebles, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_PuertaInmuebles, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_PisoInmuebles, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_EscaleraInmuebles, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDInmuebles, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDComunidadInmueble, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(67, 67));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarInmueblesActionPerformed(ActionEvent evt) {
		
		
		String escalera = jTF_EscaleraInmuebles.getText();
		String puerta = jTF_PuertaInmuebles.getText();
		String piso = jTF_PisoInmuebles.getText();
		int idInmueble = Integer.parseInt(jTF_IDInmuebles.getText());
		double porcentaje = 1.0f;//Double.parseDouble(jTF_PorcentajeInmuebles.getText());
		
		Inmueble i = new Inmueble(idInmueble,escalera,piso,puerta,porcentaje);
		
		this.dispose();
	}
	
	private void jB_CancelarInmueblesActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
