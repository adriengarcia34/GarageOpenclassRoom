package com.tp.moteur;

public class MoteurHybride extends Moteur{

	public MoteurHybride() {
		super();
	}
	
	public MoteurHybride(String pCylindre, double pPrix) {
		super(pCylindre, pPrix, TypeMoteur.HYBRIDE);
	}
}
