package dao;
import java.util.List;

import javax.naming.InitialContext;

import negocio.Reciboinmueble;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Reciboinmueble.
 * @see .Reciboinmueble
 * @author Hibernate Tools
 */
public class ReciboinmuebleHome {


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

	public void persist(Reciboinmueble transientInstance) {
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Reciboinmueble instance) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Reciboinmueble instance) {
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Reciboinmueble persistentInstance) {
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Reciboinmueble merge(Reciboinmueble detachedInstance) {
		try {
			Reciboinmueble result = (Reciboinmueble) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Reciboinmueble findById(java.lang.Integer id) {
		try {
			Reciboinmueble instance = (Reciboinmueble) sessionFactory
					.getCurrentSession().get("Reciboinmueble", id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Reciboinmueble instance) {
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Reciboinmueble")
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
