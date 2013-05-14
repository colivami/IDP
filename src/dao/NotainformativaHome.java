package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Notainformativa;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Notainformativa.
 * @see negocio.Notainformativa
 * @author Hibernate Tools
 */
public class NotainformativaHome {

	private Session sesion = null;
	private Transaction tx = null;

	public void anyadirNotainformativa(Notainformativa ni) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(ni);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Notainformativa> buscarNotainformativas() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Notainformativa> listaNotainformativaes = (ArrayList<Notainformativa>) sesion.createQuery("from Notainformativa").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaNotainformativaes;
	}
	
	
	public void borrarNotainformativa(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Notainformativa ni = (Notainformativa) sesion.get(Notainformativa.class, new Integer(id));
		sesion.delete(ni);
		tx.commit();
		sesion.close();
	}
}
