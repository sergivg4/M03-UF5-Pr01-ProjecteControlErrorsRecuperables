/**
 * 
 */
package vista;

import controller.ClientsDao;
import funciones.UtilConsole;
import model.Client;

/**@author Sergi Valenzuela García
 * M03-UF4 
 * 10 mar 2023
 */
class ClientsVistaController {

	public void inicio(ClientsDao cd) {
		int opcion;
		do {
			// submenu
			System.out.println("0. Salir");
			System.out.println("1. Afegir");
			System.out.println("2. Buscar");
			System.out.println("3. Eliminar");
			System.out.println("4. Modificar");
			System.out.println("5. Mostrar");
			opcion = UtilConsole.pedirInt();
			// segun lo que se escoge, se llama al submenu del controlador que toca
			if (opcion == 1) {
			} else if (opcion == 2) {
			}else if (opcion == 3) {
			}else if(opcion == 4) {
			} else if (opcion == 5) {
				IniciVistaController.imprimir(cd);
			}
		} while (opcion != 0);
	}
	
	private static Client comprobarId(ClientsDao cd) {
		int id = -1;
		Client c = null;
		do {
			IniciVistaController.imprimir(cd);
			System.out.println("Introduce la id: ");
			id = UtilConsole.pedirInt();
			c = cd.buscar(id);
			if (c == null) {
				System.out.println("id erroneo");
			}
		} while (c == null);
		return c;
	}
	
}
