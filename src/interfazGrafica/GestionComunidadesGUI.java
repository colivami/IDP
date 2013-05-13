package interfazGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import negocio.Comunidad;
import dao.ComunidadHome;


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
public class GestionComunidadesGUI extends javax.swing.JFrame {
	private JLabel jL_IDComunidades;
	private JLabel jL_MaxRecibosPendientesComunidades;
	private JButton jB_CancelarComunidades;
	private JButton jB_GuardarComunidades;
	private JTextField jTF_IDPresidenteComunidades;
	private JTextField jTF_EstadoComunidades;
	private JTextField jTF_MaxRecibosPendientesComunidades;
	private JTextField jTF_CalleComunidades;
	private JTextField jTF_IDComunidades;
	private JLabel jL_IDPresidenteComunidades;
	private JLabel jL_EstadoComunidades;
	private JLabel jL_CalleComunidades;

	/**
	* Auto-generated main method to display this JFrame
	*/
	TablaComunidad tComunidad;
	int row;
	ComunidadHome cHome;
	boolean modificar = false;
	int idComunidad_mod;
		
	public GestionComunidadesGUI(TablaComunidad tc) {
		super();
		initGUI();
		tComunidad = tc;
	}
	
	public GestionComunidadesGUI(TablaComunidad tc, int row, ComunidadHome cHome, Comunidad c) {
		super();
		initGUI();
		this.tComunidad = tc;
		this.row = row;
		this.cHome = cHome;
		this.modificar = true;
		
		idComunidad_mod = c.getIdComunidad();
		jTF_CalleComunidades.setText(c.getCalle());
		jTF_EstadoComunidades.setText(c.getEstado());
		jTF_IDComunidades.setText(""+c.getIdComunidad());
		jTF_MaxRecibosPendientesComunidades.setText(""+c.getMaxrecibospendientes());
		jTF_IDPresidenteComunidades.setText(""+c.getIdInmueblePresidente());

	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Comunidades");
			{
				jL_IDComunidades = new JLabel();
				jL_IDComunidades.setText("ID");
			}
			{
				jL_CalleComunidades = new JLabel();
				jL_CalleComunidades.setText("Calle");
			}
			{
				jL_MaxRecibosPendientesComunidades = new JLabel();
				jL_MaxRecibosPendientesComunidades.setText("MaxRecibosPendientes");
			}
			{
				jL_EstadoComunidades = new JLabel();
				jL_EstadoComunidades.setText("Estado");
			}
			{
				jL_IDPresidenteComunidades = new JLabel();
				jL_IDPresidenteComunidades.setText("ID Presidente");
			}
			{
				jTF_IDPresidenteComunidades = new JTextField();
			}
			{
				jTF_EstadoComunidades = new JTextField();
			}
			{
				jTF_MaxRecibosPendientesComunidades = new JTextField();
			}
			{
				jTF_IDComunidades = new JTextField();
			}
			{
				jB_GuardarComunidades = new JButton();
				jB_GuardarComunidades.setText("Guardar");
				jB_GuardarComunidades.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarComunidadesActionPerformed(evt);
					}
				});
			}
			{
				jB_CancelarComunidades = new JButton();
				jB_CancelarComunidades.setText("Cancelar");
				jB_CancelarComunidades.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarComunidadesActionPerformed(evt);
					}
				});
			}
			{
				jTF_CalleComunidades = new JTextField();
			}
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(36, 36)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jL_IDPresidenteComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					                .addComponent(jL_EstadoComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					                .addGap(91))
					            .addComponent(jL_MaxRecibosPendientesComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					                .addComponent(jL_CalleComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					                .addGap(91))
					            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					                .addComponent(jL_IDComunidades, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					                .addGap(91)))
					        .addGap(12)
					        .addGroup(thisLayout.createParallelGroup()
					            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					                .addComponent(jB_CancelarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 25, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_IDPresidenteComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_EstadoComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_MaxRecibosPendientesComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_CalleComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addComponent(jTF_IDComunidades, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGap(24)
					        .addComponent(jB_GuardarComunidades, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 168, Short.MAX_VALUE)))
					.addContainerGap(61, 61));
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(19, 19)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_CalleComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_CalleComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_MaxRecibosPendientesComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_MaxRecibosPendientesComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_EstadoComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_EstadoComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jL_IDPresidenteComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDPresidenteComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(jB_GuardarComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jB_CancelarComunidades, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarComunidadesActionPerformed(ActionEvent evt) {
		String calle = jTF_CalleComunidades.getText();
		int maxrecibospendientes = Integer.parseInt(jTF_MaxRecibosPendientesComunidades.getText());
		String estado = jTF_EstadoComunidades.getText();
		int idComunidad = Integer.parseInt(jTF_IDComunidades.getText());
		int idInmueblePresidente = Integer.parseInt(jTF_IDPresidenteComunidades.getText());
		
		if(modificar) {
			cHome.borrarComunidad(idComunidad_mod);
			tComunidad.removeRow(row);
		}
		else {
			Set inmuebles = new HashSet();
			Set facturas = new HashSet();
			Set notainformativas = new HashSet();
			
			Comunidad c = new Comunidad(idComunidad, calle, maxrecibospendientes, estado, idInmueblePresidente, inmuebles, facturas, notainformativas);
			
			tComunidad.addComunidad(c);
		}
		
		this.dispose();
	}
	
	private void jB_CancelarComunidadesActionPerformed(ActionEvent evt) {
		this.dispose();
	}
	
	private void jB_InformeActionPerformed(ActionEvent evt) {
		System.out.println("jB_Informe.actionPerformed, event="+evt);
		//TODO add your code for jB_Informe.actionPerformed
	}

}
