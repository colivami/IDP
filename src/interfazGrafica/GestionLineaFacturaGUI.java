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
public class GestionLineaFacturaGUI extends javax.swing.JFrame {
	private JTextField jTF_IDConceptoLinea;
	private JTextField jTF_ObservacionLinea;
	private JTextField jTF_ImporteLinea;
	private JLabel jL_IDNotaInformativa;
	private JButton jB_GuardarLinea;
	private JButton jB_CancelarLinea;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTF_IDLinea;
	private JTextField jTF_NumFacturaLinea;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionLineaFacturaGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTF_IDConceptoLinea = new JTextField();
			}
			{
				jTF_NumFacturaLinea = new JTextField();
			}
			{
				jTF_ObservacionLinea = new JTextField();
			}
			{
				jTF_ImporteLinea = new JTextField();
			}
			{
				jTF_IDLinea = new JTextField();
			}
			{
				jLabel4 = new JLabel();
				jLabel4.setText("ID Concepto");
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("Num Factura");
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Observacion");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Importe");
			}
			{
				jL_IDNotaInformativa = new JLabel();
				jL_IDNotaInformativa.setText("ID Linea");
			}
			{
				jB_CancelarLinea = new JButton();
				jB_CancelarLinea.setText("Cancelar");
				jB_CancelarLinea.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarLineaActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarLinea = new JButton();
				jB_GuardarLinea.setText("Guardar");
				jB_GuardarLinea.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarLineaActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_ImporteLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_ObservacionLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_NumFacturaLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDConceptoLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(52)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_GuardarLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_CancelarLinea, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(16, 16));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(53, 53)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jB_GuardarLinea, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(63)
				        .addComponent(jB_CancelarLinea, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(17)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jL_IDNotaInformativa, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
				        .addGap(39)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_IDConceptoLinea, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_NumFacturaLinea, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_ObservacionLinea, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_ImporteLinea, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_IDLinea, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(72, Short.MAX_VALUE));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_CancelarLineaActionPerformed(ActionEvent evt) {
		System.out.println("jB_CancelarLinea.actionPerformed, event="+evt);
		//TODO add your code for jB_CancelarLinea.actionPerformed
	}
	
	private void jB_GuardarLineaActionPerformed(ActionEvent evt) {
		System.out.println("jB_GuardarLinea.actionPerformed, event="+evt);
		//TODO add your code for jB_GuardarLinea.actionPerformed
	}

}
