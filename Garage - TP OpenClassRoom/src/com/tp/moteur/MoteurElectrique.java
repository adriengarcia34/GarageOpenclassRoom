package com.tp.moteur;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique() {
		super();
	}
	
	public MoteurElectrique(String pCylindre, double pPrix) {
		super(pCylindre, pPrix, TypeMoteur.ELECTRIQUE);
	}
}
