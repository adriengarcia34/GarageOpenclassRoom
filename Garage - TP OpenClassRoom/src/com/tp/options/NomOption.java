package com.tp.options;

public enum NomOption {
GPS ("GPS"),
SIEGE ("Siège chauffant"),
CLIM ("Climatisation"),
BARRE ("Barre de toit"),
VITREELEC ("Vitre electrique");
	
	private String name = "";

	NomOption(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
