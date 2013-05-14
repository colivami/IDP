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

import negocio.Reciboinmueble;

import dao.ReciboinmuebleHome;


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
public class GestionRecibosGUI extends javax.swing.JFrame {
	private JTextField jTF_IDRecibo;
	private JLabel jL_IDNotaInformativa;
	private JButton jB_GuardarRecibo;
	private JLabel jLabel5;
	private JButton jB_CancelarRecibo;
	private JTextField jTF_IDCartaRecibo;
	private JLabel jLabel4;
	private JTextField jTF_NotaInformativaRecibo;
	private JLabel jLabel3;
	private JTextField jTF_IDInmuebleRecibo;
	private JLabel jLabel2;
	private JTextField jTF_ImporteRecibo;
	private JLabel jLabel1;
	private JTextField jTF_FechaPagoRecibo;

	/**
	* Auto-generated main method to display this JFrame
	*/
	TablaRecibo TRecibo;
	ReciboinmuebleHome rHome;
	int row;
	int idRecibo_mod;
	boolean modificar = false;
	
	public GestionRecibosGUI(TablaRecibo tr) {
		super();
		initGUI();
		this.TRecibo = tr;
	}
	
	public GestionRecibosGUI(TablaRecibo tr, int row, ReciboinmuebleHome rHome, Reciboinmueble r) {
		super();
		initGUI();
		this.TRecibo = tr;
		this.row = row;
		this.rHome = rHome;
		this.idRecibo_mod = r.getIdReciboinmueble();
		this.modificar = true;
		
		jTF_FechaPagoRecibo.setText(r.getFechapago());
		jTF_IDCartaRecibo.setText(""+r.getCarta().getIdCarta());
		jTF_IDInmuebleRecibo.setText(""+r.getInmueble().getIdInmueble());
		jTF_IDRecibo.setText(""+r.getIdReciboinmueble());
		jTF_ImporteRecibo.setText(r.getImporte().toString());
		jTF_NotaInformativaRecibo.setText(""+r.getNotainformativa().getIdNotainformativa());
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jTF_IDRecibo = new JTextField();
			}
			{
				jL_IDNotaInformativa = new JLabel();
				jL_IDNotaInformativa.setText("ID Recibo");
			}
			{
				jTF_FechaPagoRecibo = new JTextField();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Fecha pago");
			}
			{
				jTF_ImporteRecibo = new JTextField();
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Importe");
			}
			{
				jTF_IDInmuebleRecibo = new JTextField();
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("ID Inmueble");
			}
			{
				jTF_NotaInformativaRecibo = new JTextField();
			}
			{
				jLabel4 = new JLabel();
				jLabel4.setText("ID Nota Inf,");
			}
			{
				jTF_IDCartaRecibo = new JTextField();
			}
			{
				jLabel5 = new JLabel();
				jLabel5.setText("ID Carta");
			}
			{
				jB_CancelarRecibo = new JButton();
				jB_CancelarRecibo.setText("Cancelar");
				jB_CancelarRecibo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarReciboActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarRecibo = new JButton();
				jB_GuardarRecibo.setText("Guardar");
				jB_GuardarRecibo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarReciboActionPerformed(evt);
					}
				});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDNotaInformativa, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_FechaPagoRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_ImporteRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDInmuebleRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_NotaInformativaRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDCartaRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 25, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_CancelarRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_GuardarRecibo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(63, 63)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jL_IDNotaInformativa, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_GuardarRecibo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
				.addGap(37)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_FechaPagoRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_ImporteRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDInmuebleRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_NotaInformativaRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDCartaRecibo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 17, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(26)
				        .addComponent(jB_CancelarRecibo, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap(62, 62));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_CancelarReciboActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
	private void jB_GuardarReciboActionPerformed(ActionEvent evt) {
	}

}
