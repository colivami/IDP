package interfazGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import negocio.Concepto;
import dao.ConceptoHome;


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
public class GestionConceptoGUI extends javax.swing.JFrame {
	private JTextField jTF_IDConcepto;
	private JButton jB_CancelarConcepto;
	private JButton jB_GuardarConcepto;
	private JTextArea jTA_DescripcionConcepto;
	private JLabel jL_IDConcepto;
	private JLabel jL_DescripcionConcepto;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	boolean modificar = false;
	TablaConcepto tConcepto;
	ConceptoHome cHome;
	int idConcepto_mod;
	int row;
	
	public GestionConceptoGUI(TablaConcepto tc) {
		super();
		initGUI();
		this.tConcepto = tc;
	}
	
	public GestionConceptoGUI(TablaConcepto tc, int row, ConceptoHome cHome, Concepto c) {
		super();
		initGUI();
		this.row = row;
		this.cHome = cHome;
		this.tConcepto = tc;
		this.idConcepto_mod = c.getIdConcepto();
		modificar = true;
		
		
		jTF_IDConcepto.setText(c.getIdConcepto().toString());
		jTA_DescripcionConcepto.setText(c.getDescripcion().toString());
		
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTF_IDConcepto = new JTextField();
			}
			{
				jTA_DescripcionConcepto = new JTextArea();
			}
			{
				jB_CancelarConcepto = new JButton();
				jB_CancelarConcepto.setText("Cancelar");
				jB_CancelarConcepto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarConceptoActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarConcepto = new JButton();
				jB_GuardarConcepto.setText("Guardar");
				jB_GuardarConcepto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarConceptoActionPerformed(evt);
					}
				});
			}
			{
				jL_IDConcepto = new JLabel();
				jL_IDConcepto.setText("ID");
			}
			{
				jL_DescripcionConcepto = new JLabel();
				jL_DescripcionConcepto.setText("Descripcion");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(37, 37)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDConcepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDConcepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jL_DescripcionConcepto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jTA_DescripcionConcepto, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
				.addGap(29)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_CancelarConcepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_GuardarConcepto, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(19, 19));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(57, 57)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jL_DescripcionConcepto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jL_IDConcepto, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
				                .addGap(39)))
				        .addComponent(jTF_IDConcepto, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 83, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jTA_DescripcionConcepto, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(8)
				        .addComponent(jB_GuardarConcepto, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(63)
				        .addComponent(jB_CancelarConcepto, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 8, Short.MAX_VALUE)))
				.addContainerGap(52, 52));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarConceptoActionPerformed(ActionEvent evt) {
//		String idConcepto = jTF_IDConcepto.getText();
		String descripcion = jTA_DescripcionConcepto.getText();


		if (modificar) {
			cHome.updateConcepto(idConcepto_mod, descripcion);
			tConcepto.setValueAt(descripcion, row, 1);
		}
		else {
			Concepto c = new Concepto();
//			c.setIdConcepto(Integer.parseInt(idConcepto));
			c.setDescripcion(descripcion);
			tConcepto.addConcepto(c);
		}
		this.dispose();
	}
	
	private void jB_CancelarConceptoActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
