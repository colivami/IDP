package dao;

import java.util.List;

import javax.naming.InitialContext;

import negocio.Datosbancarios;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Datosbancarios.
 * @see .Datosbancarios
 * @author Hibernate Tools
 */
public class DatosbancariosHome {


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

	public void persist(Datosbancarios transientInstance) {
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Datosbancarios instance) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Datosbancarios instance) {
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Datosbancarios persistentInstance) {
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Datosbancarios merge(Datosbancarios detachedInstance) {
		try {
			Datosbancarios result = (Datosbancarios) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Datosbancarios findById(int id) {
		try {
			Datosbancarios instance = (Datosbancarios) sessionFactory
					.getCurrentSession().get("Datosbancarios", id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Datosbancarios instance) {
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Datosbancarios")
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
