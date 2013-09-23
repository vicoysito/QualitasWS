package wsPlanet;

import utiles.GuardaMoviles;


public class GuardaDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardaMoviles gb = new GuardaMoviles();
		try {
			//gb.IngresaDatos("nuevo dato1");
			gb.ObtieneDatos();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
