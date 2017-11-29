package tp4;

public class Chien extends Animal{

	private String nomProprietaire;
	
	public Chien(String nomProprietaire, float poids, String nom) {
		super(poids, nom);
		this.nomProprietaire = nomProprietaire;
	}
	
	public String getNomProprietaire() {
		return nomProprietaire;
	}

	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}

	@Override
	public String toString() {
		return "Chien [nomProprietaire=" + nomProprietaire + ", toString()=" + super.toString() + "]";
	}
	
	
}
