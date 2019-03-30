package com.tp.options;

public class SiegeChauffant implements Option {

	private double prix;
	private NomOption nomOpt;
	
	public SiegeChauffant() {
		nomOpt = NomOption.SIEGE;
		prix = 562.9;
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
