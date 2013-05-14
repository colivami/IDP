package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;

import negocio.Carta;
import negocio.Carta;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Carta.
 * @see negocio.Carta
 * @author Hibernate Tools
 */
public class CartaHome {
	private Session sesion = null;
	private Transaction tx = null;

	public void anyadirCarta(Carta c) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(c);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Carta> buscarCartas() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Carta> listaCartaes = (ArrayList<Carta>) sesion.createQuery("from Carta").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaCartaes;
	}
	
	
	public void borrarCarta(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Carta c = (Carta) sesion.get(Carta.class, new Integer(id));
		sesion.delete(c);
		tx.commit();
		sesion.close();
	}
}
