package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;

import negocio.Concepto;
import negocio.Concepto;

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
	
	
//	private final SessionFactory sessionFactory = getSessionFactory();
//
//	protected SessionFactory getSessionFactory() {
//		try {
//			return (SessionFactory) new InitialContext()
//					.lookup("SessionFactory");
//		} catch (Exception e) {
//			throw new IllegalStateException(
//					"Could not locate SessionFactory in JNDI");
//		}
//	}
//
//	public void persist(Concepto transientInstance) {
//		try {
//			sessionFactory.getCurrentSession().persist(transientInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachDirty(Concepto instance) {
//		try {
//			sessionFactory.getCurrentSession().saveOrUpdate(instance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachClean(Concepto instance) {
//		try {
//			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void delete(Concepto persistentInstance) {
//		try {
//			sessionFactory.getCurrentSession().delete(persistentInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Concepto merge(Concepto detachedInstance) {
//		try {
//			Concepto result = (Concepto) sessionFactory.getCurrentSession()
//					.merge(detachedInstance);
//			return result;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Concepto findById(java.lang.Integer id) {
//		try {
//			Concepto instance = (Concepto) sessionFactory.getCurrentSession()
//					.get("negocio.Concepto", id);
//			if (instance == null) {
//			} else {
//			}
//			return instance;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public List findByExample(Concepto instance) {
//		try {
//			List results = sessionFactory.getCurrentSession()
//					.createCriteria("negocio.Concepto")
//					.add(Example.create(instance)).list();
//			return results;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
	
	

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
}
