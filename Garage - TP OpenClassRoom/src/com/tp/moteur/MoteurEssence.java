package com.tp.moteur;

public class MoteurEssence extends Moteur{

	public MoteurEssence() {
		super();
	}
	
	public MoteurEssence(String pCylindre, double pPrix) {
		super(pCylindre, pPrix, TypeMoteur.ESSENCE);
	}
}
