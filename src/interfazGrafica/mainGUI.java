package interfazGrafica;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.query.JRHibernateQueryExecuterFactory;
import net.sf.jasperreports.view.JasperViewer;

import org.hibernate.classic.Session;

import dao.InmuebleHome;
import dao.UtilidadHibernate;

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
public class mainGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			//e.printStackTrace();
		}
	}


	private JMenuItem helpMenuItem;
	private JMenu jMenu5;
	private JButton jBAltaComunidad;
	private JButton jBModificarPropietario;
	private JButton jBBajaPropietario;
	private JInternalFrame jF_Inmuebles;
	private JInternalFrame jF_Comunidades;
	private JButton jBAltaPropietario;
	private JInternalFrame jF_Propietarios;
	private JTabbedPane jTabbedPane1;
	private JMenuItem deleteMenuItem;
	private JSeparator jSeparator1;
	private JMenuItem pasteMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem cutMenuItem;
	private JMenu jMenu4;
	private JMenuItem exitMenuItem;
	private JSeparator jSeparator2;
	private JMenuItem closeFileMenuItem;
	private JMenuItem saveAsMenuItem;
	private JMenuItem saveMenuItem;
	private JButton jB_InformeComunidades;
	private JTable jT_Comunidades;
	private JTable jT_Inmuebles;
	private JTable jT_Propietarios;
	private JButton jBAltaInmueble;
	private JButton jBBajaInmueble;
	private JButton jBModificarInmueble;
	private JButton jBModificarComunidad;
	private JButton jBBajaComunidad;
	private JMenuItem openFileMenuItem;
	private JMenuItem newFileMenuItem;
	private JMenu jMenu3;
	private JMenuBar jMenuBar1;
	
	TablaInmueble TInmuebles = new TablaInmueble();

 	GestionPropietariosGUI gp = new GestionPropietariosGUI();
	GestionInmueblesGUI    gi = new GestionInmueblesGUI(TInmuebles);
	GestionComunidadesGUI  gc = new GestionComunidadesGUI();
	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				mainGUI inst = new mainGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public mainGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("Gestión");
			{
				jTabbedPane1 = new JTabbedPane();
				getContentPane().add(jTabbedPane1, BorderLayout.CENTER);
				{
					jF_Propietarios = new JInternalFrame();
					GroupLayout jF_PropietariosLayout = new GroupLayout((JComponent)jF_Propietarios.getContentPane());
					jF_Propietarios.getContentPane().setLayout(jF_PropietariosLayout);
					jTabbedPane1.addTab("Propietarios", null, jF_Propietarios, null);
					{
						jBAltaPropietario = new JButton();
						jBAltaPropietario.setText("Dar de Alta");
						jBAltaPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaPropietarioActionPerformed(evt);
							}
						});
					}
					{
						jBBajaPropietario = new JButton();
						jBBajaPropietario.setText("Dar de Baja");
						jBBajaPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaPropietarioActionPerformed(evt);
							}
						});
					}
					{
						jBModificarPropietario = new JButton();
						jBModificarPropietario.setText("Modificar");
						jBModificarPropietario.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarPropietarioActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_PropietariosModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Column 1", "Column 2" });
						jT_Propietarios = new JTable();
						jT_Propietarios.setModel(jT_PropietariosModel);
					}
					jF_PropietariosLayout.setHorizontalGroup(jF_PropietariosLayout.createSequentialGroup()
						.addComponent(jT_Propietarios, 0, 643, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_PropietariosLayout.createParallelGroup()
						    .addComponent(jBModificarPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBBajaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBAltaPropietario, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
					jF_PropietariosLayout.setVerticalGroup(jF_PropietariosLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						    .addComponent(jT_Propietarios, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(310, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.LEADING, jF_PropietariosLayout.createSequentialGroup()
						    .addGap(12)
						    .addComponent(jBAltaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBBajaPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBModificarPropietario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(310, Short.MAX_VALUE)));
				}
				{
					jF_Inmuebles = new JInternalFrame();
					jTabbedPane1.addTab("Inmuebles", null, jF_Inmuebles, null);
					GroupLayout jF_InmueblesLayout = new GroupLayout((JComponent)jF_Inmuebles.getContentPane());
					jF_Inmuebles.getContentPane().setLayout(jF_InmueblesLayout);
					jF_Inmuebles.setVisible(true);
					{
						jBModificarInmueble = new JButton();
						jBModificarInmueble.setText("Modificar");
						jBModificarInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarInmuebleActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_InmueblesModel = TInmuebles;
//						TableModel jT_InmueblesModel = 
//							new DefaultTableModel(
//									new String[][] { { "One", "Two" }, { "Three", "Four" } },
//									new String[] { "Column 1", "Column 2" });
						jT_Inmuebles = new JTable();
						jT_Inmuebles.setModel(jT_InmueblesModel);
					}
					{
						jBBajaInmueble = new JButton();
						jBBajaInmueble.setText("Dar de Baja");
						jBBajaInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaInmuebleActionPerformed(evt);
							}
						});
					}
					{
						jBAltaInmueble = new JButton();
						jBAltaInmueble.setText("Dar de Alta");
						jBAltaInmueble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaInmuebleActionPerformed(evt);
							}
						});
					}
					jF_InmueblesLayout.setHorizontalGroup(jF_InmueblesLayout.createSequentialGroup()
						.addComponent(jT_Inmuebles, 0, 643, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_InmueblesLayout.createParallelGroup()
						    .addComponent(jBBajaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBAltaInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBModificarInmueble, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
					jF_InmueblesLayout.setVerticalGroup(jF_InmueblesLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.LEADING, jF_InmueblesLayout.createSequentialGroup()
						    .addComponent(jT_Inmuebles, 0, 184, Short.MAX_VALUE)
						    .addContainerGap(310, 310))
						.addGroup(GroupLayout.Alignment.LEADING, jF_InmueblesLayout.createSequentialGroup()
						    .addGap(12)
						    .addComponent(jBAltaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBBajaInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						    .addComponent(jBModificarInmueble, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						    .addContainerGap(310, Short.MAX_VALUE)));
				}
				{
					jF_Comunidades = new JInternalFrame();
					jTabbedPane1.addTab("Comunidades", null, jF_Comunidades, null);
					GroupLayout jF_ComunidadesLayout = new GroupLayout((JComponent)jF_Comunidades.getContentPane());
					jF_Comunidades.getContentPane().setLayout(jF_ComunidadesLayout);
					jF_Comunidades.setVisible(true);
					{
						jBAltaComunidad = new JButton();
						jBAltaComunidad.setText("Dar de Alta");
						jBAltaComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBAltaComunidadActionPerformed(evt);
							}
						});
					}
					{
						TableModel jT_ComunidadesModel = 
								new DefaultTableModel(
										new String[][] { { "One", "Two" }, { "Three", "Four" } },
										new String[] { "Column 1", "Column 2" });
						jT_Comunidades = new JTable();
						jT_Comunidades.setModel(jT_ComunidadesModel);
					}
					{
						jB_InformeComunidades = new JButton();
						jB_InformeComunidades.setText("Informe");
						jB_InformeComunidades.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jB_InformeComunidadesActionPerformed(evt);
							}
						});
					}
					{
						jBBajaComunidad = new JButton();
						jBBajaComunidad.setText("Dar de Baja");
						jBBajaComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBBajaComunidadActionPerformed(evt);
							}
						});
					}
					{
						jBModificarComunidad = new JButton();
						jBModificarComunidad.setText("Modificar");
						jBModificarComunidad.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jBModificarComunidadActionPerformed(evt);
							}
						});
					}
					jF_ComunidadesLayout.setHorizontalGroup(jF_ComunidadesLayout.createSequentialGroup()
						.addComponent(jT_Comunidades, 0, 643, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jF_ComunidadesLayout.createParallelGroup()
						    .addComponent(jBBajaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBModificarComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jBAltaComunidad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						    .addComponent(jB_InformeComunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addContainerGap());
					jF_ComunidadesLayout.setVerticalGroup(jF_ComunidadesLayout.createSequentialGroup()
						.addGroup(jF_ComunidadesLayout.createParallelGroup()
						    .addComponent(jT_Comunidades, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
						    .addGroup(GroupLayout.Alignment.LEADING, jF_ComunidadesLayout.createSequentialGroup()
						        .addGap(12)
						        .addComponent(jBAltaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBBajaComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						        .addComponent(jBModificarComunidad, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
						.addGap(52)
						.addComponent(jB_InformeComunidades, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(208, Short.MAX_VALUE));
				}
			}
			this.setSize(800, 600);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("File");
					{
						newFileMenuItem = new JMenuItem();
						jMenu3.add(newFileMenuItem);
						newFileMenuItem.setText("New");
					}
					{
						openFileMenuItem = new JMenuItem();
						jMenu3.add(openFileMenuItem);
						openFileMenuItem.setText("Open");
					}
					{
						saveMenuItem = new JMenuItem();
						jMenu3.add(saveMenuItem);
						saveMenuItem.setText("Save");
					}
					{
						saveAsMenuItem = new JMenuItem();
						jMenu3.add(saveAsMenuItem);
						saveAsMenuItem.setText("Save As ...");
					}
					{
						closeFileMenuItem = new JMenuItem();
						jMenu3.add(closeFileMenuItem);
						closeFileMenuItem.setText("Close");
					}
					{
						jSeparator2 = new JSeparator();
						jMenu3.add(jSeparator2);
					}
					{
						exitMenuItem = new JMenuItem();
						jMenu3.add(exitMenuItem);
						exitMenuItem.setText("Exit");
					}
				}
				{
					jMenu4 = new JMenu();
					jMenuBar1.add(jMenu4);
					jMenu4.setText("Edit");
					{
						cutMenuItem = new JMenuItem();
						jMenu4.add(cutMenuItem);
						cutMenuItem.setText("Cut");
					}
					{
						copyMenuItem = new JMenuItem();
						jMenu4.add(copyMenuItem);
						copyMenuItem.setText("Copy");
					}
					{
						pasteMenuItem = new JMenuItem();
						jMenu4.add(pasteMenuItem);
						pasteMenuItem.setText("Paste");
					}
					{
						jSeparator1 = new JSeparator();
						jMenu4.add(jSeparator1);
					}
					{
						deleteMenuItem = new JMenuItem();
						jMenu4.add(deleteMenuItem);
						deleteMenuItem.setText("Delete");
					}
				}
				{
					jMenu5 = new JMenu();
					jMenuBar1.add(jMenu5);
					jMenu5.setText("Help");
					{
						helpMenuItem = new JMenuItem();
						jMenu5.add(helpMenuItem);
						helpMenuItem.setText("Help");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * PROPIETARIOS
	 */
	private void jBAltaPropietarioActionPerformed(ActionEvent evt) {
		gp.setVisible(true);
	}
	
	private void jBBajaPropietarioActionPerformed(ActionEvent evt) {

	}
	
	private void jBModificarPropietarioActionPerformed(ActionEvent evt) {
		gp.setVisible(true);
	}
	
	
	/*
	 * COMUNIDADES
	 */
	private void jBAltaComunidadActionPerformed(ActionEvent evt) {
		gc.setVisible(true);
	}
	
	private void jBBajaComunidadActionPerformed(ActionEvent evt) {

	}
	
	private void jBModificarComunidadActionPerformed(ActionEvent evt) {
		gc.setVisible(true);
	}


	/*
	 * INMUEBLES
	 */
	private void jBAltaInmuebleActionPerformed(ActionEvent evt) {
		gi.setVisible(true);
	}
	
	private void jBBajaInmuebleActionPerformed(ActionEvent evt) {
		InmuebleHome iHome = new InmuebleHome();
		int row = (int) jT_Inmuebles.getSelectedRow(); 
		if (row == -1){
		}
		else{
			int id = (int) TInmuebles.getValueAt(row, 0);
			iHome.borrarInmueble(id);
			TInmuebles.removeRow(row);
		}
	}
	
	private void jBModificarInmuebleActionPerformed(ActionEvent evt) {
		gi.setVisible(true);
	}
	
	private void jB_InformeComunidadesActionPerformed(ActionEvent evt) {
		JasperPrint informe = null;
		Session sesion= UtilidadHibernate.getSessionFactory().openSession();
		HashMap parametros = new HashMap();
		parametros.put(JRHibernateQueryExecuterFactory.PARAMETER_HIBERNATE_SESSION,sesion);
		//parametros.put("genero","Comedia");
		try {
		String fileName= "report1.jasper";
		informe= JasperFillManager.fillReport(fileName, parametros);
		}
		catch (JRException e){e.printStackTrace();}
		JasperViewer.viewReport(informe,false);
	}

}
