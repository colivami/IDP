package dao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UtilidadHibernate {
	////////////////////////////////////////
	/**
	 * Startup Hibernate and provide access to the singleton SessionFactory
	 
	  private static SessionFactory sessionFactory;

	  static {
	    try {
	       sessionFactory = new Configuration().configure().buildSessionFactory();
	    } catch (Throwable ex) {
	       System.out.println(ex.getMessage());
	       throw new ExceptionInInitializerError(ex);
	    }
	  }

	  public static SessionFactory getSessionFactory() {
	      // Alternatively, we could look up in JNDI here
	      return sessionFactory;
	  }

	  public static void shutdown() {
	      // Close caches and connection pools
	      getSessionFactory().close();
	  }
		*/
	
	
	private static SessionFactory sessionFactory;
	private static Session session; 
	private static Transaction tx; 

	static 
	{
		try 
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} 
		catch (Throwable ex) 
		{
			System.out.println(ex.getMessage());
		    throw new ExceptionInInitializerError(ex);
			}
		}

		public static SessionFactory getSessionFactory() 
		{
			// Alternatively, we could look up in JNDI here
			return sessionFactory;
		}

		public static void shutdown() 
		{
			// Close caches and connection pools
		    getSessionFactory().close();
		}
	  
		public static Session getSession()
		{ 
			if(session==null)  
				session=getSessionFactory().openSession(); 
			return session; 
		} 
		  
		public static void closeSession()
		{ 
			session.close(); 
			session=null; 
		} 
		  
		public static void beginTransaction()
		{ 
			if(tx==null) tx=getSession().beginTransaction(); 
		} 
		  
		public static void endTransaction()
		{ 
			tx.commit(); 
			tx=null; 
		} 
		
		public static void rollback() 
		{ 
		try { 
		            if (tx != null) { 
		                tx.rollback(); 
		            } 
		        } catch (HibernateException ignored) { 
		            // No se puede hacer rollback de la transacción; 
		        } 
		}
	
	/////////////////////////////////////////

}

