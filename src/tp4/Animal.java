package tp4;

public abstract class Animal {
	
	private float poids;
	private String nom;

	public Animal(float poids, String nom) {
		this.poids = poids;
		this.nom = nom;
	}
		
	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return "Animal [poids=" + poids + ", nom=" + nom + "]";
	}
	
	public abstract void manger();
	
}
