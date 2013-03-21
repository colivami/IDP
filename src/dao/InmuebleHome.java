package dao;

import java.util.List;

import javax.naming.InitialContext;

import negocio.Inmueble;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Inmueble.
 * @see .Inmueble
 * @author Hibernate Tools
 */
public class InmuebleHome {

	private org.hibernate.classic.Session sesion = null;
	private Transaction tx = null;


	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Inmueble transientInstance) {
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Inmueble instance) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Inmueble instance) {
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Inmueble persistentInstance) {
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Inmueble merge(Inmueble detachedInstance) {
		try {
			Inmueble result = (Inmueble) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Inmueble findById(int id) {
		try {
			Inmueble instance = (Inmueble) sessionFactory.getCurrentSession()
					.get("Inmueble", id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Inmueble instance) {
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Inmueble").add(Example.create(instance))
					.list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
	public void anyadirInmueble(Inmueble i) {
		sesion = sessionFactory.openSession();
		tx = sesion.beginTransaction();
		sesion.save(i);
		tx.commit();
		
	}
}
