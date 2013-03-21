package dao;

public interface PropietarioDAOInterface {

	public void anyadirPropietario( int IDPropietario,
			String NIF,
			String Nombre,
			String Direccion,
			String Poblacion,
			String Telefono,
			String Observaciones,
			String FechaAlta,
			int IDInmueble );
	
	public void borrarPropietario( int IDPopietario );
	
	public void modificarPropietario( int IDPropietario,
			String NIF,
			String Nombre,
			String Direccion,
			String Poblacion,
			String Telefono,
			String Observaciones,
			String FechaAlta,
			int IDInmueble );
}
