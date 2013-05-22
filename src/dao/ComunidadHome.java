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

	//private Session sesion = null;
	//private Transaction tx = null;
	
	public Comunidad buscarComunidadPorID(int id) {
		Session sesion = UtilidadHibernate.getSessionFactory().openSession();
		Transaction tx = sesion.beginTransaction();
		Comunidad c = (Comunidad) sesion.get(Comunidad.class, new Integer(id));
		tx.commit();
		sesion.close();
		return c;
	}
	
	
	public void anyadirComunidad(Comunidad c) {
		Session sesion = UtilidadHibernate.getSessionFactory().openSession();
		Transaction tx = sesion.beginTransaction();
		sesion.save(c);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Comunidad> buscarComunidades() {
		Session sesion = UtilidadHibernate.getSessionFactory().openSession();
		Transaction tx = sesion.beginTransaction();
		ArrayList<Comunidad> listaComunidades = (ArrayList<Comunidad>) sesion.createQuery("from Comunidad").list();
		tx.commit();
		sesion.close();
		return listaComunidades;
	}
	
	
	public void borrarComunidad(int id) {
		Session sesion = UtilidadHibernate.getSessionFactory().openSession();
		Transaction tx = sesion.beginTransaction();
		Comunidad c = (Comunidad) sesion.get(Comunidad.class, new Integer(id));
		sesion.delete(c);
		tx.commit();
		sesion.close();
	}
	
	
	public void updateComunidad(int id, String calle, int maxrecibos, String estado, int idpresidente ) {
		Session sesion = UtilidadHibernate.getSessionFactory().openSession();
		Transaction tx = sesion.beginTransaction();
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
