package abstraction.distributeurAmerique;

import abstraction.fourni.Acteur;

public class Distributeur implements Acteur{
	private String nom;
	private double stock;
	private double fonds;
	private double demande;
	
	
	public String getNom(){
		return this.nom;
	}
	
	public void next(){
		
	}

	public double getStock() {
		return this.stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public double getFonds() {
		return this.fonds;
	}

	public void setFonds(double fonds) {
		this.fonds = fonds;
	}

	public double getDemande() {
		return this.demande;
	}

	public void setDemande(double demande) {
		this.demande = demande;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
