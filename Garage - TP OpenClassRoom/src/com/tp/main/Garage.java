package com.tp.main;

import com.tp.moteur.MoteurDiesel;
import com.tp.vehicule.Marque;
import com.tp.vehicule.Vehicule;

/*
 * MOTEURS OK!, et correctement intégrés dans Voiture
 * Passer sur les options
 * Puis terminer par les classes filles de Vehicule (et la passer en abstract)
*/
public class Garage {

	public static void main(String[] args) {
		Vehicule v1 = new Vehicule(1234.5, "Bonjour", Marque.PIGEOT);
		v1.setMoteur(new MoteurDiesel("150 Chevaux", 123.4));
		System.out.println(v1.toString());
	}
}
