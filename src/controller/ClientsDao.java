/**
 * 
 */
package controller;

import java.util.HashMap;

import model.Client;
import model.Persistable;

/**@author Sergi Valenzuela García
 * M03-UF4 
 * 10 mar 2023
 */
public class ClientsDao implements Persistable<Client>{

	private HashMap<Integer, Client> clients = new HashMap<>();
	
	@Override
	public void guardar(Client cli) {
   // Guarda los clientes en el hashMap
 }

	@Override
	public void eliminar(int id) {
	// Elimina los clientes del hashMap
	}

	@Override
	public Client buscar(int id) {
		return null;
	}

	@Override
	public HashMap<Integer, Client> getMap() {
		return clients;
	}

	
}
