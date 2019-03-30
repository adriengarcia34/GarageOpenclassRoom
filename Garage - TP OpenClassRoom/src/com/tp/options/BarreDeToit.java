package com.tp.options;

public class BarreDeToit implements Option {

	private double prix;
	private NomOption nomOpt;
	
	public BarreDeToit() {
		nomOpt = NomOption.BARRE;
		prix = 29.9;
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
