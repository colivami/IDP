package dao;

public interface InmuebleDAOInterface {
	
	public void anyadirInmueble( int IDInmueble,
			String escalera,
			String piso,
			String puerta,
			float porcentaje,
			int IDComunidad );
	
	public void borrarInmueble( int IDInmueble );
	
	public void modificarInmueble( int IDInmueble,
			String escalera,
			String piso,
			String puerta,
			float porcentaje,
			int IDComunidad );

}
