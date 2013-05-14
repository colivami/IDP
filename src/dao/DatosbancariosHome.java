package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Datosbancarios;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Datosbancarios.
 * @see negocio.Datosbancarios
 * @author Hibernate Tools
 */
public class DatosbancariosHome {

	private Session sesion = null;
	private Transaction tx = null;

	public void anyadirDatosbancarios(Datosbancarios db) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(db);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Datosbancarios> buscarDatosbancarioss() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Datosbancarios> listaDatosbancarioses = (ArrayList<Datosbancarios>) sesion.createQuery("from Datosbancarios").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaDatosbancarioses;
	}
	
	
	public void borrarDatosbancarios(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Datosbancarios db = (Datosbancarios) sesion.get(Datosbancarios.class, new Integer(id));
		sesion.delete(db);
		tx.commit();
		sesion.close();
	}
}
