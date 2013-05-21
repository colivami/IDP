package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Comunidad;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Comunidad.
 * @see negocio.Comunidad
 * @author Hibernate Tools
 */
public class ComunidadHome {

	private Session sesion = null;
	private Transaction tx = null;
	
	public Comunidad buscarComunidadPorID(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Comunidad c = (Comunidad) sesion.get(Comunidad.class, new Integer(id));
		tx.commit();
		sesion.close();
		return c;
	}
	
	
	public void anyadirComunidad(Comunidad c) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(c);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Comunidad> buscarComunidades() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Comunidad> listaComunidades = (ArrayList<Comunidad>) sesion.createQuery("from Comunidad").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaComunidades;
	}
	
	
	public void borrarComunidad(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Comunidad c = (Comunidad) sesion.get(Comunidad.class, new Integer(id));
		sesion.delete(c);
		tx.commit();
		sesion.close();
	}
	
	
	public void updateComunidad(int id, String calle, int maxrecibos, String estado, int idpresidente ) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Comunidad c = (Comunidad) sesion.get(Comunidad.class, new Integer(id));
		sesion.update(c);
		c.setCalle(calle);
		c.setMaxrecibospendientes(maxrecibos);
		c.setEstado(estado);
		c.setIdInmueblePresidente(idpresidente);
		tx.commit();
		sesion.close();
	}
	
	
}
