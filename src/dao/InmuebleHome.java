package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Comunidad;
import negocio.Inmueble;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Inmueble.
 * @see negocio.Inmueble
 * @author Hibernate Tools
 */
public class InmuebleHome {
	
	private Session sesion = null;
	private Transaction tx = null;
	public Inmueble buscarInmueblePorID(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Inmueble i = (Inmueble) sesion.get(Inmueble.class, new Integer(id));
		tx.commit();
		sesion.close();
		return i;
	}
	
	public void anyadirInmueble(Inmueble i) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(i);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Inmueble> buscarInmuebles() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Inmueble> listaInmuebles = (ArrayList<Inmueble>) sesion.createQuery("from Inmueble").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaInmuebles;
	}
	

	public void borrarInmueble(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Inmueble i = (Inmueble) sesion.get(Inmueble.class, new Integer(id));
		sesion.delete(i);
		tx.commit();
		sesion.close();
	}
	

	public void updateInmueble(int id, String escalera, String piso, String puerta, double porcentaje, int IDcom, int IDProp, int IDDatos) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Inmueble i = (Inmueble) sesion.get(Inmueble.class, new Integer(id));
		sesion.update(i);
		tx.commit();
		sesion.close();
	}
}
