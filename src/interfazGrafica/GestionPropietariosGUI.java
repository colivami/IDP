package interfazGrafica;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class GestionPropietariosGUI extends javax.swing.JFrame {
	private JLabel jL_IDPropietario;
	private JLabel jL_FechaAltaPropietario;
	private JTextField jTF_ObservacionesPropietario;
	private JTextField jTF_FechaAltaPropietario;
	private JTextField jTF_TelefonoPropietario;
	private JTextField jTF_PoblacionPropietario;
	private JTextField jTF_DireccionPropietario;
	private JTextField jTF_NombrePropietario;
	private JTextField jTF_NIFPropietario;
	private JTextField jTF_IDPropietario;
	private JLabel jL_ObservacionesPropietario;
	private JButton jB_GuardarComunidades;
	private JButton jB_CancelarComunidades;
	private JLabel jL_TelefonoPropietario;
	private JLabel jL_PoblacionPropietario;
	private JLabel jL_DireccionPropietario;
	private JLabel jL_NombrePropietario;
	private JLabel jL_NIFPropietario;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionPropietariosGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jL_IDPropietario = new JLabel();
				jL_IDPropietario.setText("ID");
			}
			{
				jL_NIFPropietario = new JLabel();
				jL_NIFPropietario.setText("NIF");
			}
			{
				jL_NombrePropietario = new JLabel();
				jL_NombrePropietario.setText("Nombre");
			}
			{
				jL_DireccionPropietario = new JLabel();
				jL_DireccionPropietario.setText("Dirección");
			}
			{
				jL_PoblacionPropietario = new JLabel();
				jL_PoblacionPropietario.setText("Población");
			}
			{
				jL_TelefonoPropietario = new JLabel();
				jL_TelefonoPropietario.setText("Teléfono");
			}
			{
				jTF_TelefonoPropietario = new JTextField();
			}
			{
				jTF_PoblacionPropietario = new JTextField();
			}
			{
				jTF_DireccionPropietario = new JTextField();
			}
			{
				jTF_NombrePropietario = new JTextField();
			}
			{
				jTF_IDPropietario = new JTextField();
			}
			{
				jTF_FechaAltaPropietario = new JTextField();
			}
			{
				jTF_NIFPropietario = new JTextField();
			}
			{
				jL_ObservacionesPropietario = new JLabel();
				jL_ObservacionesPropietario.setText("Observaciones");
			}
			{
				jB_CancelarComunidades = new JButton();
				jB_CancelarComunidades.setText("Cancelar");
			}
			{
				jB_GuardarComunidades = new JButton();
				jB_GuardarComunidades.setText("Guardar");
			}
			{
				jL_FechaAltaPropietario = new JLabel();
				jL_FechaAltaPropietario.setText("Fecha Alta");
			}
			{
				jTF_ObservacionesPropietario = new JTextField();
			}
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(0, 0, Short.MAX_VALUE)
					        .addComponent(jTF_IDPropietario, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(6))
					    .addComponent(jL_ObservacionesPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jL_IDPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jTF_ObservacionesPropietario, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					        .addGap(10)
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_TelefonoPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_TelefonoPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGap(25))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jL_NIFPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					                .addComponent(jTF_NIFPropietario, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_NombrePropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_NombrePropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_DireccionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_DireccionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_PoblacionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_PoblacionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGap(24)
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_FechaAltaPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_FechaAltaPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(0, 22, GroupLayout.PREFERRED_SIZE)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jB_CancelarComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jB_GuardarComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, 20));
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(19, 19)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jL_TelefonoPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_PoblacionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_DireccionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_NombrePropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_NIFPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_IDPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_FechaAltaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					        .addGap(8)
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jTF_TelefonoPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_PoblacionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_DireccionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addGroup(thisLayout.createSequentialGroup()
					                .addGap(0, 0, Short.MAX_VALUE)
					                .addComponent(jTF_FechaAltaPropietario, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_NombrePropietario, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_NIFPropietario, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_IDPropietario, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(48)
					        .addComponent(jB_GuardarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addGap(37)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jB_CancelarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(72))
					    .addComponent(jTF_ObservacionesPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jL_ObservacionesPropietario, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(72)))
					.addContainerGap());
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
