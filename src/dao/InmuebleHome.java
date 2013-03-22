package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

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

//
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
//	public void persist(Inmueble transientInstance) {
//		try {
//			sessionFactory.getCurrentSession().persist(transientInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachDirty(Inmueble instance) {
//		try {
//			sessionFactory.getCurrentSession().saveOrUpdate(instance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void attachClean(Inmueble instance) {
//		try {
//			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public void delete(Inmueble persistentInstance) {
//		try {
//			sessionFactory.getCurrentSession().delete(persistentInstance);
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Inmueble merge(Inmueble detachedInstance) {
//		try {
//			Inmueble result = (Inmueble) sessionFactory.getCurrentSession()
//					.merge(detachedInstance);
//			return result;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public Inmueble findById(int id) {
//		try {
//			Inmueble instance = (Inmueble) sessionFactory.getCurrentSession()
//					.get("negocio.Inmueble", id);
//			if (instance == null) {
//			} else {
//			}
//			return instance;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//
//	public List findByExample(Inmueble instance) {
//		try {
//			List results = sessionFactory.getCurrentSession()
//					.createCriteria("negocio.Inmueble")
//					.add(Example.create(instance)).list();
//			return results;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}

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
		ArrayList<Inmueble> listaInmuebles = 
				(ArrayList<Inmueble>) sesion.createQuery("from Inmueble").list();
		sesion.getTransaction().commit(); 
		return listaInmuebles;
	}
}
