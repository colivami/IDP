package dao;

import java.util.List;

import javax.naming.InitialContext;

import negocio.Lineafactura;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Lineafactura.
 * @see .Lineafactura
 * @author Hibernate Tools
 */
public class LineafacturaHome {


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

	public void persist(Lineafactura transientInstance) {
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachDirty(Lineafactura instance) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void attachClean(Lineafactura instance) {
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public void delete(Lineafactura persistentInstance) {
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Lineafactura merge(Lineafactura detachedInstance) {
		try {
			Lineafactura result = (Lineafactura) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Lineafactura findById(java.lang.Integer id) {
		try {
			Lineafactura instance = (Lineafactura) sessionFactory
					.getCurrentSession().get("Lineafactura", id);
			if (instance == null) {
			} else {
			}
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByExample(Lineafactura instance) {
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("Lineafactura")
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
