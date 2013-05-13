package negocio;

// Generated 21-mar-2013 18:13:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Comunidad generated by hbm2java
 */
public class Comunidad implements java.io.Serializable {

	private int idComunidad;
	private Comunidad comunidad;
	private String calle;
	private Integer maxrecibospendientes;
	private String estado;
	private Integer idInmueblePresidente;
	private Set inmuebles = new HashSet(0);
	private Set facturas = new HashSet(0);
	private Set notainformativas = new HashSet(0);

	public Comunidad() {
	}

	public Comunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Comunidad(Comunidad comunidad, String calle,
			Integer maxrecibospendientes, String estado,
			Integer idInmueblePresidente, Set inmuebles, Set facturas,
			Set notainformativas) {
		this.comunidad = comunidad;
		this.calle = calle;
		this.maxrecibospendientes = maxrecibospendientes;
		this.estado = estado;
		this.idInmueblePresidente = idInmueblePresidente;
		this.inmuebles = inmuebles;
		this.facturas = facturas;
		this.comunidad = comunidad;
		this.notainformativas = notainformativas;
	}

	public int getIdComunidad() {
		return this.idComunidad;
	}

	public void setIdComunidad(int idComunidad) {
		this.idComunidad = idComunidad;
	}


	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getMaxrecibospendientes() {
		return this.maxrecibospendientes;
	}

	public void setMaxrecibospendientes(Integer maxrecibospendientes) {
		this.maxrecibospendientes = maxrecibospendientes;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdInmueblePresidente() {
		return this.idInmueblePresidente;
	}

	public void setIdInmueblePresidente(Integer idInmueblePresidente) {
		this.idInmueblePresidente = idInmueblePresidente;
	}


	public Comunidad getComunidad() {
		return this.comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Set getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(Set inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Set getFacturas() {
		return facturas;
	}

	public void setFacturas(Set facturas) {
		this.facturas = facturas;
	}

	public Set getNotainformativas() {
		return notainformativas;
	}

	public void setNotainformativas(Set notainformativas) {
		this.notainformativas = notainformativas;
	}

}
