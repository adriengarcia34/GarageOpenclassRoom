package com.tp.options;

public class VitreElectrique implements Option {

	private double prix;
	private NomOption nomOpt;
	
	public VitreElectrique() {
		nomOpt = NomOption.VITREELEC;
		prix = 212.35;
	}
	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}
	@Override
	public NomOption getNomOption() {
		// TODO Auto-generated method stub
		return nomOpt;
	}

}
