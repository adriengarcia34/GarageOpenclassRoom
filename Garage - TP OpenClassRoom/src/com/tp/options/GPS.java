package com.tp.options;

public class GPS implements Option {

	private double prix;
	private NomOption nomOpt;
	
	public GPS() {
		nomOpt = NomOption.GPS;
		prix = 113.5;
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
