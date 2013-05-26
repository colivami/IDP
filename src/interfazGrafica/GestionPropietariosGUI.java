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

import negocio.Propietario;
import dao.PropietarioHome;


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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jL_IDPropietario;
	private JLabel jL_FechaAltaPropietario;
	private JTextArea jTA_ObservacionesPropietario;
	private JTextField jTF_FechaAltaPropietario;
	private JTextField jTF_TelefonoPropietario;
	private JTextField jTF_PoblacionPropietario;
	private JTextField jTF_DireccionPropietario;
	private JTextField jTF_NombrePropietario;
	private JTextField jTF_NIFPropietario;
	private JTextField jTF_IDPropietario;
	private JLabel jL_ObservacionesPropietario;
	private JButton jB_GuardarPropietarioes;
	private JButton jB_CancelarPropietarioes;
	private JLabel jL_TelefonoPropietario;
	private JLabel jL_PoblacionPropietario;
	private JLabel jL_DireccionPropietario;
	private JLabel jL_NombrePropietario;
	private JLabel jL_NIFPropietario;

	/**
	* Auto-generated main method to display this JFrame
	*/
	TablaPropietario tPropietario;
	PropietarioHome pHome;
	boolean modificar = false;
	int idPropietario_mod;
	int row;
		
	public GestionPropietariosGUI(TablaPropietario tp) {
		super();
		initGUI();
		tPropietario = tp;
	}		
	public GestionPropietariosGUI(TablaPropietario tp, int row, PropietarioHome pHome, Propietario p) {
		super();
		initGUI();
		tPropietario = tp;
		this.pHome = pHome;
		idPropietario_mod = p.getIdPropietario();
		this.row = row;
		
		jTF_IDPropietario.setText(""+p.getIdPropietario());
		jTF_FechaAltaPropietario.setText(p.getFechaalta());
//		jTF_IDInmueblePropietario.setText(p.getInmuebles());
		jTF_DireccionPropietario.setText(p.getDireccion());
		jTF_NIFPropietario.setText(p.getNif());
		jTF_PoblacionPropietario.setText(p.getPoblacion());
		jTF_NombrePropietario.setText(p.getNombre());
		jTF_TelefonoPropietario.setText(p.getTelefono());
		
		modificar = true;
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(thisLayout);
			this.setTitle("Propietarios");
			{
				jL_IDPropietario = new JLabel();
				jL_IDPropietario.setText("ID");
			}
			{
				jTA_ObservacionesPropietario = new JTextArea();
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
				jB_CancelarPropietarioes = new JButton();
				jB_CancelarPropietarioes.setText("Cancelar");
				jB_CancelarPropietarioes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_CancelarPropietarioesActionPerformed(evt);
					}
				});
			}
			{
				jB_GuardarPropietarioes = new JButton();
				jB_GuardarPropietarioes.setText("Guardar");
				jB_GuardarPropietarioes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jB_GuardarPropietarioesActionPerformed(evt);
					}
				});
			}
			{
				jL_FechaAltaPropietario = new JLabel();
				jL_FechaAltaPropietario.setText("Fecha Alta");
			}
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jL_TelefonoPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_FechaAltaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_PoblacionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_DireccionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_NombrePropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_NIFPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jL_IDPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
					        .addGap(8)
					        .addGroup(thisLayout.createParallelGroup()
					            .addComponent(jTF_TelefonoPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_FechaAltaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_PoblacionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_DireccionPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_NombrePropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_NIFPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_IDPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(48)
					        .addComponent(jB_GuardarPropietarioes, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addGap(37)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jB_CancelarPropietarioes, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(jTA_ObservacionesPropietario, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(jL_ObservacionesPropietario, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 42, Short.MAX_VALUE)))
					.addContainerGap(19, 19));
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jL_IDPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTF_IDPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_NIFPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_NIFPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_NombrePropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_NombrePropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(0, 14, Short.MAX_VALUE)
					        .addComponent(jL_ObservacionesPropietario, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					        .addGap(12)))
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					            .addComponent(jL_DireccionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTF_DireccionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					        .addGroup(thisLayout.createParallelGroup()
					            .addGroup(thisLayout.createSequentialGroup()
					                .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					                    .addComponent(jL_PoblacionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					                    .addComponent(jTF_PoblacionPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					                .addGap(0, 24, GroupLayout.PREFERRED_SIZE)
					                .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					                    .addComponent(jL_FechaAltaPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					                    .addComponent(jTF_FechaAltaPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					            .addGroup(thisLayout.createSequentialGroup()
					                .addGap(0, 25, GroupLayout.PREFERRED_SIZE)
					                .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					                    .addComponent(jL_TelefonoPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					                    .addComponent(jTF_TelefonoPropietario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					                .addGap(25))))
					    .addComponent(jTA_ObservacionesPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
					.addGap(0, 19, GroupLayout.PREFERRED_SIZE)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jB_CancelarPropietarioes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jB_GuardarPropietarioes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, 17));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jB_GuardarPropietarioesActionPerformed(ActionEvent evt) {
		String nif = jTF_NIFPropietario.getText();
		String direccion = jTF_DireccionPropietario.getText();
		String fechaalta = jTF_FechaAltaPropietario.getText();
		String nombre = jTF_NombrePropietario.getText();
		String poblacion = jTF_PoblacionPropietario.getText();
		String telefono= jTF_TelefonoPropietario.getText();
		String observaciones = jTA_ObservacionesPropietario.getText();

		int idPropietario= Integer.parseInt(jTF_IDPropietario.getText());

		if (modificar) {
			pHome.borrarPropietario(idPropietario_mod);
			tPropietario.removeRow(row);
		}
		
		Propietario p = new Propietario();
		p.setDireccion(direccion);
		p.setFechaalta(fechaalta);
		p.setIdPropietario(idPropietario);
		p.setNif(nif);
		p.setNombre(nombre);
		p.setPoblacion(poblacion);
		p.setObservaciones(observaciones);
		p.setTelefono(telefono);
		
		tPropietario.addPropietario(p);
		this.dispose();
	}
	
	private void jB_CancelarPropietarioesActionPerformed(ActionEvent evt) {
		this.dispose();
	}

}
