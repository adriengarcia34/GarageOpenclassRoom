package com.tp.vehicule;

import java.util.List;

import com.tp.moteur.Moteur;
import com.tp.options.Option;

public class Vehicule {

	private double prix;
	private String nom;
	private List<Option> options;
	private Marque nomMarque;
	private Moteur moteur;
	
	public Vehicule(){
		
	}
	
	public Vehicule(double pPrix, String pNom, Marque pNomMarque) {
		prix = pPrix;
		nom = pNom;
		nomMarque = pNomMarque;
		moteur = null;
	}
	
	public void setMoteur(Moteur pMoteur) {
		moteur = pMoteur;
		prix += moteur.getPrix();
	}
	
	public String toString() {
		return "Prix: " + prix + " nom: " + nom + " nomMarque: " + nomMarque.toString() + " " + moteur.toString();
	}
	
	public void addOption(Option opt) {
		
	}
	
	public Marque getMarque() {
		return nomMarque;
	}
	
	public List<Option> getOptions(){
		return options;
	}
	
	public double getPrix() {
		return prix;
	}
}
