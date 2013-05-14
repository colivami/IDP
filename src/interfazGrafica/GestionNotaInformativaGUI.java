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
public class GestionNotaInformativaGUI extends javax.swing.JFrame {
	private JButton jB_CancelarNota;
	private JButton jB_GuardarNota;
	private JTextField jTF_IDComunidadNotaInformativa;
	private JLabel jLabel3;
	private JLabel jL_IDNotaInformativa;
	private JLabel jL_ImporteNotaInformativa;
	private JLabel jL_FechaNotaInformativa;
	private JTextField jTF_IDNotaInformativa;
	private JTextField jTF_ImporteNotaInformativa;
	private JTextField jTF_FechaNotaInformativa;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionNotaInformativaGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jB_CancelarNota = new JButton();
				jB_CancelarNota.setText("Cancelar");
				jB_CancelarNota.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarNotaActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarNota = new JButton();
				jB_GuardarNota.setText("Guardar");
				jB_GuardarNota.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarNotaActionPerformed(evt);
					}
				});
			}
			{
				jTF_IDComunidadNotaInformativa = new JTextField();
			}
			{
				jTF_FechaNotaInformativa = new JTextField();
			}
			{
				jTF_ImporteNotaInformativa = new JTextField();
			}
			{
				jTF_IDNotaInformativa = new JTextField();
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("ID Comunidad");
			}
			{
				jL_FechaNotaInformativa = new JLabel();
				jL_FechaNotaInformativa.setText("Fecha cálculo");
			}
			{
				jL_ImporteNotaInformativa = new JLabel();
				jL_ImporteNotaInformativa.setText("Importe");
			}
			{
				jL_IDNotaInformativa = new JLabel();
				jL_IDNotaInformativa.setText("ID Nota Inf,");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(18, 18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_ImporteNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_ImporteNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_FechaNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_FechaNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDComunidadNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 65, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_CancelarNota, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_GuardarNota, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(43, 43)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				        .addGap(14))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_FechaNotaInformativa, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				        .addGap(14))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_ImporteNotaInformativa, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				        .addGap(14))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_IDNotaInformativa, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				        .addGap(14))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addPreferredGap(jLabel3, jB_GuardarNota, LayoutStyle.ComponentPlacement.INDENT)
				        .addComponent(jB_GuardarNota, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
				.addGap(25)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDComunidadNotaInformativa, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 29, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_FechaNotaInformativa, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 29, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_ImporteNotaInformativa, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 29, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDNotaInformativa, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 29, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(38)
				        .addComponent(jB_CancelarNota, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(70, 70));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarNotaActionPerformed(ActionEvent evt) {
		System.out.println("jB_GuardarNota.actionPerformed, event="+evt);
		//TODO add your code for jB_GuardarNota.actionPerformed
	}
	
	private void jB_CancelarNotaActionPerformed(ActionEvent evt) {
		System.out.println("jB_CancelarNota.actionPerformed, event="+evt);
		//TODO add your code for jB_CancelarNota.actionPerformed
	}

}
