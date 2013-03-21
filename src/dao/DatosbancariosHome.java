package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;

import negocio.Datosbancarios;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Datosbancarios.
 * @see negocio.Datosbancarios
 * @author Hibernate Tools
 */
public class DatosbancariosHome {

	private static final Log log = LogFactory.getLog(DatosbancariosHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Datosbancarios transientInstance) {
		log.debug("persisting Datosbancarios instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Datosbancarios instance) {
		log.debug("attaching dirty Datosbancarios instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Datosbancarios instance) {
		log.debug("attaching clean Datosbancarios instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Datosbancarios persistentInstance) {
		log.debug("deleting Datosbancarios instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Datosbancarios merge(Datosbancarios detachedInstance) {
		log.debug("merging Datosbancarios instance");
		try {
			Datosbancarios result = (Datosbancarios) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Datosbancarios findById(int id) {
		log.debug("getting Datosbancarios instance with id: " + id);
		try {
			Datosbancarios instance = (Datosbancarios) sessionFactory
					.getCurrentSession().get("negocio.Datosbancarios", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Datosbancarios instance) {
		log.debug("finding Datosbancarios instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("negocio.Datosbancarios")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
