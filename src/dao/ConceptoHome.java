package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;

import negocio.Concepto;
import negocio.Concepto;
import negocio.Factura;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Concepto.
 * @see negocio.Concepto
 * @author Hibernate Tools
 */
public class ConceptoHome {

	private Session sesion = null;
	private Transaction tx = null;
	
	
	

	public Concepto buscarConceptoPorID(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Concepto c = (Concepto) sesion.get(Concepto.class, new Integer(id));
		tx.commit();
		sesion.close();
		return c;
	}
	public void anyadirConcepto(Concepto i) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(i);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Concepto> buscarConceptos() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Concepto> listaConceptos = (ArrayList<Concepto>) sesion.createQuery("from Concepto").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaConceptos;
	}
	
	
	public void borrarConcepto(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Concepto i = (Concepto) sesion.get(Concepto.class, new Integer(id));
		sesion.delete(i);
		tx.commit();
		sesion.close();
	}
	
	public void updateConcepto(int id, String descripcion) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Concepto c = (Concepto) sesion.get(Concepto.class, new Integer(id));
		sesion.update(c);
		c.setDescripcion(descripcion);
		tx.commit();
		sesion.close();
	}
}
