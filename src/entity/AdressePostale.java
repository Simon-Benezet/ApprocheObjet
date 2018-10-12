package entity;

public class AdressePostale 
{
	int numRue;
	String rue;
	int codePostal;
	String ville;
	
	public AdressePostale(int numRue, String rue, int codePostal, String ville)
	{
		super();
		this.numRue = numRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	/* TEST
	public AdressePostale(String rue, int numRue, int codePostal, String ville)
	{
		super();
		this.numRue = numRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	*/
	
	@Override
	public String toString() {
		//return "AdressePostale [numRue=" + numRue + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
		return numRue + " " + rue + " " + codePostal + " " + ville;
	}

	public void affiche()
	{
		System.out.println(numRue + "\n" + rue + "\n" + codePostal + "\n" + ville);
	}
}
