package com.tp.main;

import com.tp.moteur.MoteurDiesel;
import com.tp.moteur.MoteurElectrique;
import com.tp.moteur.MoteurEssence;
import com.tp.moteur.MoteurHybride;
import com.tp.options.BarreDeToit;
import com.tp.options.Climatisation;
import com.tp.options.GPS;
import com.tp.options.SiegeChauffant;
import com.tp.options.VitreElectrique;
import com.tp.vehicule.A300B;
import com.tp.vehicule.D4;
import com.tp.vehicule.Lagouna;
import com.tp.vehicule.Vehicule;

/*
 * Creation de véhicule OK, mais certaines incohérences/optimisations comme le prix du moteur qui n'est pas utilisé dans l'exemple
 * Faire la classe garage et gérer entrée / sorties
 * - lecture fichier lors de la création du garage
 * - enregistrement toString lors de l'appel addVoiture
*/
public class Garage {

	public static void main(String[] args) {
		Vehicule lag1 = new Lagouna();
	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	System.out.println(lag1.toString());
	   	
	   	Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	System.out.println(A300B_2.toString());
	   	 //garage.addVoiture(lag1);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	System.out.println(d4_1.toString());
	   	 //garage.addVoiture(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	System.out.println(lag2.toString());
	   	// garage.addVoiture(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	System.out.println(A300B_1.toString());
	   	 //garage.addVoiture(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	System.out.println(d4_2.toString());
	   	 //garage.addVoiture(d4_2);   
	}
}
