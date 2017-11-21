package tp2;

public class Main {
	
	public static void main(String[] args) {
		MonDossierMedical dossierMedical = new MonDossierMedical(10);	// dossierMedical objet du type MonDossierMedical
		// dossierMedical.age = 0; erreur age est private
		dossierMedical.anniversaire();
		int age = dossierMedical.getAge();
		System.out.println("age = " + age);
		dossierMedical.setAge(0);
		age = dossierMedical.getAge();
		System.out.println("age = " + age);
		
		Statistique stat = new Statistique(10);
		
		float resultat = stat.moyenne();
		System.out.println("La moyenne est : " + resultat);
		
		float resultat1 = stat.ecartType();
		System.out.println("L'écart-type est : " + resultat1);
		
		float resultat2 = stat.ecartType(resultat);
		System.out.println("L'écart-type est : " + resultat2);
		
		float[] notes = new float[10]; 
		
		Statistique stat1 = new Statistique(notes);
		
	}

}
