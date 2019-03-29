package com.tp.moteur;

public enum TypeMoteur {
DIESEL ("Moteur DIESEL"),
ESSENCE ("Moteur ESSENCE"),
HYBRIDE ("Moteur HYBRIDE"),
ELECTRIQUE ("Moteur ELECTRIQUE");
	
	private String name = "";
	
	TypeMoteur(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
