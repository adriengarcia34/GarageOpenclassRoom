package com.tp.moteur;

public abstract class Moteur {

	private TypeMoteur type;
	private String cylindre;
	private double prix;
	
	
	public Moteur() {
		cylindre = "2 CV";
		prix = 0;
		type = null;
	}
	
	public Moteur(String pCylindre, double pPrix, TypeMoteur pType) {
		cylindre = pCylindre;
		prix = pPrix;
		type = pType;
	}
	
	public String toString() {
		return type + " " + cylindre;
	}
	
	public double getPrix() {
		return prix;
	}
}
