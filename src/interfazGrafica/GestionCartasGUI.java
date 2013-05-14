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

import negocio.Carta;
import dao.CartaHome;


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
public class GestionCartasGUI extends javax.swing.JFrame {
	private JTextField jTF_IDCarta;
	private JLabel jL_IDCarta;
	private JTextField jTF_FechaCarta;
	private JButton jB_GuardarCarta;
	private JButton jB_CancelarCarta;
	private JLabel jL_FechaCarta;

	/**
	* Auto-generated main method to display this JFrame
	*/
	CartaHome carHome;
	TablaCarta TCarta;
	int row;
	int idCarta_mod;
	boolean modificar = false;
	
	public GestionCartasGUI(TablaCarta tc) {
		super();
		initGUI();
		this.TCarta = tc;
	}
	
	public GestionCartasGUI(TablaCarta tc, int row, CartaHome carHome, Carta c) {
		super();
		initGUI();
		this.TCarta = tc;
		this.row = row;
		this.idCarta_mod = c.getIdCarta();
		this.carHome = carHome;
		modificar = true;
		
		jTF_FechaCarta.setText(c.getFecha().toString());
		jTF_IDCarta.setText(""+c.getIdCarta());
		
	}
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTF_IDCarta = new JTextField();
			}
			{
				jL_IDCarta = new JLabel();
				jL_IDCarta.setText("ID");
			}
			{
				jTF_FechaCarta = new JTextField();
			}
			{
				jL_FechaCarta = new JLabel();
				jL_FechaCarta.setText("Fecha");
			}
			{
				jB_CancelarCarta = new JButton();
				jB_CancelarCarta.setText("Cancelar");
				jB_CancelarCarta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarCartaActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarCarta = new JButton();
				jB_GuardarCarta.setText("Guardar");
				jB_GuardarCarta.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarCartaActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(23, 23)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_FechaCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_FechaCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_GuardarCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_CancelarCarta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(49, 49)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(jL_IDCarta, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jL_FechaCarta, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
				        .addGap(103)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_IDCarta, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jTF_FechaCarta, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(22)
				        .addComponent(jB_GuardarCarta, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(42)
				        .addComponent(jB_CancelarCarta, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 27, Short.MAX_VALUE)))
				.addContainerGap(48, 48));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_CancelarCartaActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
	private void jB_GuardarCartaActionPerformed(ActionEvent evt) {
		System.out.println("jB_GuardarCarta.actionPerformed, event="+evt);
		//TODO add your code for jB_GuardarCarta.actionPerformed
	}

}
