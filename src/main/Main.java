package main;

import entity.AdressePostale;
import entity.Personne;

public class Main {

	public static void main(String[] args) 
	{
		AdressePostale adresse1 = new AdressePostale(51, "Rue albert truc", 30000, "Nîmes");
		AdressePostale adresse2 = new AdressePostale(10, "Rue des oliviers", 30000, "Nîmes");
		
		Personne personne1 = new Personne("Bernard", "Henri", adresse1);
		personne1.affiche();
		Personne personne2 = new Personne("Didier", "Didier", adresse2);
		personne2.affiche();
	}
}
