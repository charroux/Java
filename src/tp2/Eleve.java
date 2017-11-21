package tp2;

public class Eleve {

	private String nom;
	private float note;
	
	public Eleve(float note) {
		this.note = note;
		// initialiser nom
	}
	
	public static void main(String[] a) {
		Eleve eleve = new Eleve(10);
		float n = eleve.getNote();
		eleve.setNote(20);
		eleve.setNote(15);
		// complèter avec l'utilisation du nom
	}
	
	// ecrire get et set pour nom
	
	public float getNote() {
		return note;
	}
	
	public void setNote(float note) {
		this.note = note;
	}
	
}
