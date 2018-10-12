package entity;

public class Personne
{
	String nom;
	String prenom;
	AdressePostale adressepostale;
	
	
	
	public Personne(String nom, String prenom, AdressePostale adressepostale) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressepostale = adressepostale;
	}

	@Override
	public String toString() 
	{
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adressepostale=" + adressepostale + "]";
	}
	
	public void affiche()
	{
		System.out.println(nom + "\n" + prenom + "\n"+ adressepostale + "\n");
	}

	
}
