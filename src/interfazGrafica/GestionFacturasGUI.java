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
public class GestionFacturasGUI extends javax.swing.JFrame {
	private JTextField jTF_NumFactura;
	private JLabel jLabel3;
	private JTextField jTF_IDNotaInformativaFactura;
	private JButton jB_CancelarFactura;
	private JButton jB_GuardarFactura;
	private JLabel jLabel2;
	private JTextField jTF_FechaFactura;
	private JLabel jLabel1;
	private JTextField jTF_IDComunidadFactura;
	private JLabel jL_IDConcepto;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public GestionFacturasGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTF_NumFactura = new JTextField();
			}
			{
				jB_CancelarFactura = new JButton();
				jB_CancelarFactura.setText("Cancelar");
				jB_CancelarFactura.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarFacturaActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarFactura = new JButton();
				jB_GuardarFactura.setText("Guardar");
				jB_GuardarFactura.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarFacturaActionPerformed(evt);
					}
				});
			}
			{
				jL_IDConcepto = new JLabel();
				jL_IDConcepto.setText("Num Factura");
			}
			{
				jTF_IDComunidadFactura = new JTextField();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("ID Comunidad");
			}
			{
				jTF_FechaFactura = new JTextField();
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Fecha");
			}
			{
				jTF_IDNotaInformativaFactura = new JTextField();
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("ID Nota informativa");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(18, 18)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDConcepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_NumFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDComunidadFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_FechaFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDNotaInformativaFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_GuardarFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_CancelarFactura, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(26, 26)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jLabel3, GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
				            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
				            .addComponent(jLabel1, GroupLayout.Alignment.LEADING, 0, 99, Short.MAX_VALUE)
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jL_IDConcepto, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE)))
				        .addGap(39)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jTF_IDNotaInformativaFactura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jTF_FechaFactura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jTF_IDComunidadFactura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jTF_NumFactura, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				        .addGap(57))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(40)
				        .addComponent(jB_GuardarFactura, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(63)
				        .addComponent(jB_CancelarFactura, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(59, 59));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarFacturaActionPerformed(ActionEvent evt) {
		System.out.println("jB_GuardarFactura.actionPerformed, event="+evt);
		//TODO add your code for jB_GuardarFactura.actionPerformed
	}
	
	private void jB_CancelarFacturaActionPerformed(ActionEvent evt) {
		System.out.println("jB_CancelarFactura.actionPerformed, event="+evt);
		//TODO add your code for jB_CancelarFactura.actionPerformed
	}

}
