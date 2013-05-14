package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Comunidad;
import negocio.Inmueble;

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
//	public void persist(Comunidad transientInstance) {
//		try {
//			sessionFactory.getCurrentSession().persist(transientInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachDirty(Comunidad instance) {
//		try {
//			sessionFactory.getCurrentSession().saveOrUpdate(instance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachClean(Comunidad instance) {
//		try {
//			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void delete(Comunidad persistentInstance) {
//		try {
//			sessionFactory.getCurrentSession().delete(persistentInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Comunidad merge(Comunidad detachedInstance) {
//		try {
//			Comunidad result = (Comunidad) sessionFactory.getCurrentSession()
//					.merge(detachedInstance);
//			return result;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Comunidad findById(int id) {
//		try {
//			Comunidad instance = (Comunidad) sessionFactory.getCurrentSession()
//					.get("negocio.Comunidad", id);
//			if (instance == null) {
//			} else {
//			}
//			return instance;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public List findByExample(Comunidad instance) {
//		try {
//			List results = sessionFactory.getCurrentSession()
//					.createCriteria("negocio.Comunidad")
//					.add(Example.create(instance)).list();
//			return results;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
	
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
}
