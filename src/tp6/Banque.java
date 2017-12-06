package tp6;

import java.util.Hashtable;

public class Banque {
	
	private Hashtable<String, Compte> comptes = new Hashtable<String, Compte>(); 
	
	public void creerCompte(String nom, float solde) throws Exception{
		if(nom == null) {
			throw new Exception("nom ne doit pas etre null");
		}
		Compte compte = new Compte(solde);
		comptes.put(nom, compte);
	}
	
	public Compte getCompte(String nom) throws Exception {
		if(nom == null) {
			throw new Exception("nom ne doit pas etre null");
		}
		return comptes.get(nom);
	}

}
