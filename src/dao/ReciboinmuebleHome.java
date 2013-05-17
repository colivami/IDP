package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Carta;
import negocio.Inmueble;
import negocio.Notainformativa;
import negocio.Reciboinmueble;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Reciboinmueble.
 * @see negocio.Reciboinmueble
 * @author Hibernate Tools
 */
public class ReciboinmuebleHome {

	private Session sesion = null;
	private Transaction tx = null;

	public void anyadirReciboinmueble(Reciboinmueble ri) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(ri);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Reciboinmueble> buscarReciboinmuebles() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Reciboinmueble> listaReciboinmueblees = (ArrayList<Reciboinmueble>) sesion.createQuery("from Reciboinmueble").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaReciboinmueblees;
	}
	
	
	public void borrarReciboinmueble(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Reciboinmueble ri = (Reciboinmueble) sesion.get(Reciboinmueble.class, new Integer(id));
		sesion.delete(ri);
		tx.commit();
		sesion.close();
	}
	public void updateRecibo(int id, String fecha, Inmueble i, Notainformativa ni, Carta c) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Reciboinmueble ri = (Reciboinmueble) sesion.get(Reciboinmueble.class, new Integer(id));
		sesion.update(ri);
		ri.setFechapago(fecha);
		ri.setInmueble(i);
		ri.setNotainformativa(ni);
		ri.setCarta(c);
		tx.commit();
		sesion.close();
	}
	
}
