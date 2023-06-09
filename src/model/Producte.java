package model;

import java.io.Serializable;

import exceptions.StockInsuficientException;

/**@author Sergi Valenzuela García
 * M03-UF4 
 * 10 mar 2023
 */
public class Producte extends ProducteAbstract implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stock;
	private double precio;
	
	/**
	 * 
	 * @param id
	 * @param nom
	 * @param stock
	 * @param precio
	 */
	public Producte(int id, String nom, int stock, double precio) {
		super(id, nom);
		this.stock = stock;
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void afegirStock(int cantidad) {
		this.stock = stock + cantidad;
	}
	
	public void treureStock(int cantidad) throws StockInsuficientException {
        if (this.stock < cantidad) {
            throw new StockInsuficientException("No hay suficiente Stock.");
        }
        this.stock -= cantidad;
    }

	@Override
	public String toString() {
		return "Producte [ Id = " + getId() + ", Nom = " + getNom() + ", Stock = " + stock + ", Precio = " + precio + "€ ]";
	}

	
	
}
