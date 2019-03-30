package com.tp.options;

public class Climatisation implements Option {

	private double prix;
	private NomOption nomOpt;
	
	public Climatisation() {
		nomOpt = NomOption.CLIM;
		prix = 347.3;
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
