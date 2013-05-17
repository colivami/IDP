package dao;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;

import negocio.Concepto;
import negocio.Factura;
import negocio.Lineafactura;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Home object for domain model class Lineafactura.
 * @see negocio.Lineafactura
 * @author Hibernate Tools
 */
public class LineafacturaHome {
	private Session sesion = null;
	private Transaction tx = null;

	public void anyadirLineafactura(Lineafactura lf) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		sesion.save(lf);
		tx.commit();
		sesion.close();
	}
	
	public ArrayList<Lineafactura> buscarLineafacturas() {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		ArrayList<Lineafactura> listaLineafacturaes = (ArrayList<Lineafactura>) sesion.createQuery("from Lineafactura").list();
		sesion.getTransaction().commit();
		sesion.close();
		return listaLineafacturaes;
	}
	
	
	public void borrarLineafactura(int id) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Lineafactura lf = (Lineafactura) sesion.get(Lineafactura.class, new Integer(id));
		sesion.delete(lf);
		tx.commit();
		sesion.close();
	}
	
	public void updateLineafactura(int id, double importe, String observacion, Factura f, Concepto c) {
		sesion = UtilidadHibernate.getSessionFactory().openSession();
		tx = sesion.beginTransaction();
		Lineafactura lf = (Lineafactura) sesion.get(Lineafactura.class, new Integer(id));
		sesion.update(lf);
		lf.setConcepto(c);
		lf.setFactura(f);
		lf.setObservacion(observacion);
		lf.setImportelinea(importe);
		tx.commit();
		sesion.close();
	}
	
}
