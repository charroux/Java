package tp4;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Chien milou = new Chien("Tintin", 5, "Milou");
		Animal animal = new Animal(500, "Vache");
		Chien mirza = new Chien("Castafiore", 3, "Mirza");
		Chien medor = new Chien("Dupont", 3, "Medor");
		
		Animal[] animaux = new Animal[4];
		animaux[0] = milou;
		animaux[1] = animal;
		animaux[2] = mirza;
		animaux[3] = medor;
		
		for(Animal a: animaux) {
			System.out.println(a);
		}
		
		System.out.println("");
		
		Animal[] autresAnimaux = {milou, animal, mirza, medor};
		for(int i=0; i<autresAnimaux.length; i++) {
			System.out.println(autresAnimaux[i]);
		}
		
		System.out.println("");
		
		LinkedList<Animal> listeAnimaux = new LinkedList<Animal>();
		listeAnimaux.add(milou);
		listeAnimaux.add(animal);
		listeAnimaux.add(mirza);
		listeAnimaux.add(medor);
		
		System.out.println(listeAnimaux);
	}

}
