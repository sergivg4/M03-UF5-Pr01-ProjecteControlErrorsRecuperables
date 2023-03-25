package model;

import java.util.ArrayList;
import java.util.List;

/**@author Sergi Valenzuela García
 * M03-UF4 
 * 10 mar 2023
 */
public class Pack extends ProducteAbstract{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Producte> productes;
	private double porDescuento;
	
	/**
	 * 
	 * @param id
	 * @param nom
	 * @param productes
	 * @param porDescuento
	 */
	public Pack(int id, String nom, List<Producte> productes, double porDescuento) {
		super(id, nom);
		this.productes = (ArrayList<Producte>) productes;
		this.porDescuento = porDescuento;
	}

	public List<Producte> getProductes() {
		return productes;
	}

	public void setProductes(List<Producte> productes) {
		this.productes = (ArrayList<Producte>) productes;
	}

	public double getPorDescuento() {
		return porDescuento;
	}

	public void setPorDescuento(double porDescuento) {
		this.porDescuento = porDescuento;
	}
	
	@Override
	public String toString() {
		
		StringBuilder productosDelPack = new StringBuilder();
		
		for (int i = 0; i < productes.size(); i++) {
			productosDelPack.append("\n       --> " + productes.get(i));
		}
		
		return "Pack [ Id = " + getId() + ", Nom = " + getNom() + ", Descuento = " + getPorDescuento() + "% ]" + productosDelPack;
		
	}
	
	
	
	
}
