package tp3;

public class Conducteur {
	
	private String nom;
	
	public Conducteur(String nom) {
		this.nom = nom;
	}
	
	public  String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Conducteur [nom=" + nom + "]";
	}

}
