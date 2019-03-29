package com.tp.moteur;

public class MoteurDiesel extends Moteur{

	public MoteurDiesel() {
		super();
	}
	
	public MoteurDiesel(String pCylindre, double pPrix) {
		super(pCylindre, pPrix, TypeMoteur.DIESEL);
	}
}
