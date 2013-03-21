package dao;

import java.util.List;

import javax.naming.InitialContext;

import negocio.Comunidad;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Comunidad.
 * @see .Comunidad
 * @author Hibernate Tools
 */
public class ComunidadHome {


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

	public void persist(Comunidad transientInstance) {
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Comunidad instance) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Comunidad instance) {
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Comunidad persistentInstance) {
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Comunidad merge(Comunidad detachedInstance) {
		try {
			Comunidad result = (Comunidad) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Comunidad findById(int id) {
		try {
			Comunidad instance = (Comunidad) sessionFactory.getCurrentSession()
					.get("Comunidad", id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Comunidad instance) {
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Comunidad").add(Example.create(instance))
					.list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
