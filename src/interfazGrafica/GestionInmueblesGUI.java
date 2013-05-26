package interfazGrafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import negocio.Comunidad;
import negocio.Datosbancarios;
import negocio.Inmueble;
import negocio.Propietario;
import negocio.Reciboinmueble;
import dao.ComunidadHome;
import dao.DatosbancariosHome;
import dao.InmuebleHome;
import dao.PropietarioHome;
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
	private JLabel jL_NumeroCuenta;
	private JTextField jTF_NumeroCuenta;
	private JTextField jTF_Entidad;
	private JLabel jL_Entidad;
	private JTextField jTF_IDDatosBancarios;
	private JLabel jL_IDDatosbancarios;
	private JLabel jL_IDPropietarioInmueble;
	private JTextField jTF_IDPropietarioInmueble;
	private JTextField jTF_IDComunidadInmueble;
	private JTextField jTF_IDInmuebles;
	private JLabel jL_PorcentajeInmuebles;
	private JLabel jL_PuertaInmuebles;
	private JLabel jL_EscaleraInmuebles;
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	private Set reciboinmuebles = new HashSet();
	TablaInmueble tInmueble;
	InmuebleHome iHome;
	DatosbancariosHome dbHome;
	
	boolean modificar = false;
	int idInmueble_mod;
	int idPropietario_mod;
	int row;
	
	public GestionInmueblesGUI(TablaInmueble ti) {
		super();
		initGUI();
		tInmueble = ti;
	}
	
	public GestionInmueblesGUI(TablaInmueble ti, int row, InmuebleHome iHome, Inmueble i, DatosbancariosHome dbHome, Datosbancarios db) {
		super();
		initGUI();
		tInmueble = ti;
		this.iHome = iHome;
		this.dbHome = dbHome;
		
		jTF_IDInmuebles.setText(""+i.getIdInmueble());
		jTF_PuertaInmuebles.setText(i.getPuerta());
		jTF_EscaleraInmuebles.setText(i.getEscalera());
		jTF_PorcentajeInmuebles.setText(i.getPorcentaje().toString());
		jTF_PisoInmuebles.setText(i.getPiso());
		jTF_IDPropietarioInmueble.setText(""+i.getPropietario().getIdPropietario());
		
		jTF_IDDatosBancarios.setText(""+db.getIdDatosbancarios());
		jTF_NumeroCuenta.setText(db.getNumerocuenta());
		jTF_Entidad.setText(db.getEntidad());
		
		
		this.row = row;
		this.idInmueble_mod = i.getIdInmueble();
		this.idPropietario_mod = i.getPropietario().getIdPropietario();
		modificar = true;
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
				jL_IDDatosbancarios = new JLabel();
				jL_IDDatosbancarios.setText("ID Datos Bancarios");
			}
			{
				jTF_IDDatosBancarios = new JTextField();
			}
			{
				jL_Entidad = new JLabel();
				jL_Entidad.setText("Entidad");
			}
			{
				jL_NumeroCuenta = new JLabel();
				jL_NumeroCuenta.setText("Número de Cuenta");
			}
			{
				jTF_Entidad = new JTextField();
			}
			{
				jTF_NumeroCuenta = new JTextField();
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("ID Comunidad");
			}
			{
				jTF_IDComunidadInmueble = new JTextField();
			}
			{
				jL_IDPropietarioInmueble = new JLabel();
				jL_IDPropietarioInmueble.setText("ID Propietario");
			}
			{
				jTF_IDPropietarioInmueble = new JTextField();
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
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_IDInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jL_IDDatosbancarios, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDComunidadInmueble, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDDatosBancarios, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					        .addComponent(jL_IDPropietarioInmueble, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					        .addComponent(jTF_IDPropietarioInmueble, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGap(14)
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_Entidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_NumeroCuenta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					        .addComponent(jTF_Entidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addComponent(jTF_NumeroCuenta, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGap(16)
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_EscaleraInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_EscaleraInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
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
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jB_GuardarInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jB_CancelarInmuebles, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, 21));
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(33, 33)
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
				        .addComponent(jL_IDPropietarioInmueble, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
				        .addGap(39))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
				        .addGap(39))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jL_IDInmuebles, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				        .addGap(91)))
				.addGap(12)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jB_GuardarInmuebles, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				        .addGap(25))
				    .addComponent(jTF_PorcentajeInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_PuertaInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_PisoInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_EscaleraInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDPropietarioInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDComunidadInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jTF_IDInmuebles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
				.addGap(74)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_IDDatosBancarios, 0, 216, Short.MAX_VALUE)
				        .addGap(0, 15, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jTF_Entidad, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 159, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addPreferredGap(jTF_IDDatosBancarios, jL_IDDatosbancarios, LayoutStyle.ComponentPlacement.INDENT)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(thisLayout.createSequentialGroup()
				                .addComponent(jL_IDDatosbancarios, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jL_Entidad, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addComponent(jL_NumeroCuenta, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 0, Short.MAX_VALUE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(jTF_NumeroCuenta, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
				                        .addGap(0, 8, Short.MAX_VALUE)))
				                .addGap(7))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(24)
				                .addComponent(jB_CancelarInmuebles, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 94, Short.MAX_VALUE)))))
				.addContainerGap(25, 25));
			pack();
			this.setSize(666, 330);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarInmueblesActionPerformed(ActionEvent evt) {
		
		boolean tieneRecibos = false;
		
		String escalera = jTF_EscaleraInmuebles.getText();
		String puerta = jTF_PuertaInmuebles.getText();
		String piso = jTF_PisoInmuebles.getText();
		int idInmueble = Integer.parseInt(jTF_IDInmuebles.getText());
		int idComunidad = Integer.parseInt(jTF_IDComunidadInmueble.getText());
		int idPropietario = Integer.parseInt(jTF_IDPropietarioInmueble.getText());
		int idDatosbancarios = Integer.parseInt(jTF_IDDatosBancarios.getText());
		double porcentaje = Double.parseDouble(jTF_PorcentajeInmuebles.getText());
		

		Comunidad comunidad = new ComunidadHome().buscarComunidadPorID(idComunidad); 
		Propietario propietario = new PropietarioHome().buscarPropietarioPorID(idPropietario);
		
		

		if (modificar) {
			Datosbancarios datosbancarios = new DatosbancariosHome().buscarDatosbancariosPorID(idDatosbancarios);
			String entidad =""; //datosbancarios.getEntidad();
			String numerocuenta =""; // datosbancarios.getNumerocuenta();
			
			
			if(idPropietario != idPropietario_mod) {
					
				for(Reciboinmueble r : new ReciboinmuebleHome().buscarReciboinmuebles()) {
					if(r.getInmueble().getPropietario().getIdPropietario() == idPropietario_mod &&
							r.getFechapago().isEmpty()) {
						tieneRecibos = true;
						break;
					}
				}
				
				
				if(tieneRecibos) {
					JOptionPane.showMessageDialog(null, 
							"El antiguo propietario tiene recibos sin pagar", 
							"Atención!", 
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
			
			iHome.updateInmueble(idInmueble_mod,escalera,piso,puerta,porcentaje,idComunidad, idPropietario, idDatosbancarios, entidad, numerocuenta);
			tInmueble.setValueAt(escalera, row, 1);
			tInmueble.setValueAt(piso, row, 2);
			tInmueble.setValueAt(puerta, row, 3);
			tInmueble.setValueAt(porcentaje, row, 4);
			tInmueble.setValueAt(idComunidad, row, 5);
			tInmueble.setValueAt(idPropietario, row, 6);
//			tInmueble.setValueAt(idDatosbancarios, row, 7);
//			tInmueble.setValueAt(entidad, row, 8);
//			tInmueble.setValueAt(numerocuenta, row, 9);
			
			
			
		} else if(comunidad.getEstado().toLowerCase() != "baja") {
			
//			Datosbancarios db = new Datosbancarios();
//			db.setIdDatosbancarios(Integer.parseInt(jTF_IDDatosBancarios.getText()));
//			db.setEntidad(jTF_Entidad.getText());
//			db.setNumerocuenta(jTF_NumeroCuenta.getText());
//			
//			dbHome.anyadirDatosbancarios(db);

		
			
			Inmueble i = new Inmueble();
			i.setComunidad(comunidad);
			i.setEscalera(escalera);
			i.setIdInmueble(idInmueble);
			i.setPorcentaje(porcentaje);
			i.setPropietario(propietario);
			i.setPiso(piso);
			i.setPuerta(puerta);
//			i.setDatosbancarios(db);
			
			tInmueble.addInmueble(i);
		}
		
		this.dispose();
	}
	
	private void jB_CancelarInmueblesActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
