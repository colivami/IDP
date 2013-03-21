package dao;

public interface ComunidadDAOInterface {

	public void anyadirComunidad( int IDComunidad, 
									String Calle, 
									int MaxRecibosPendientes, 
									String Estado, 
									int IDPresidente );
	
	public void borrarComunidad( int IDComunidad );
	
	public void modificarComunidad( int IDComunidad, 
									String Calle, 
									int MaxRecibosPendientes, 
									String Estado, 
									int IDPresidente );
}
