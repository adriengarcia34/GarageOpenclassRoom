package com.tp.vehicule;

import java.util.ArrayList;
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
		options = new ArrayList<Option>();
	}
	
	public void setMoteur(Moteur pMoteur) {
		moteur = pMoteur;
		//prix += moteur.getPrix();
	}
	
	public String toString() {
		String retour = "+ Voiture " + nomMarque.toString() + " : " + nom + " " + moteur.toString() + " (" + prix + "€) [";
		if (!options.isEmpty()) {
			for(int i = 0; i < options.size(); i++) {
				if(i != 0) retour += ", ";
				retour += options.get(i).getNomOption().toString() + " (" + options.get(i).getPrix() + "€)";
			}
		}
		retour += "] d'une valeur totale de " + (this.prix + this.getPrixOptions()) + " €";
		return retour;
	}
	
	public void addOption(Option opt) {
		options.add(opt);
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
	
	public double getPrixOptions() {
		double total = 0.0d;
		if (!options.isEmpty()) {
			for(int i = 0; i < options.size(); i++) {
				total += options.get(i).getPrix();
			}
		}
		return total;
	}
}
