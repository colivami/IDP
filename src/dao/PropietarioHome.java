package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;

import negocio.Concepto;
import negocio.Propietario;
import negocio.Propietario;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Propietario.
 * @see negocio.Propietario
 * @author Hibernate Tools
 */
public class PropietarioHome {
	
	private Session sesion = null;
	private Transaction tx = null;

	public Propietario buscarPropietarioPorID(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Propietario p = (Propietario) sesion.get(Propietario.class, new Integer(id));
		tx.commit();
		sesion.close();
		return p;
	}	
	
	public void anyadirPropietario(Propietario p) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(p);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Propietario> buscarPropietarios() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Propietario> listaPropietarioes = (ArrayList<Propietario>) sesion.createQuery("from Propietario").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaPropietarioes;
	}
	
	
	public void borrarPropietario(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Propietario p = (Propietario) sesion.get(Propietario.class, new Integer(id));
		sesion.delete(p);
		tx.commit();
		sesion.close();
	}
}
