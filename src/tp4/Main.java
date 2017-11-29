package tp4;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Chien milou = new Chien("Tintin", 5, "Milou");
		Chat miaou = new Chat("Siamois", 1, "Miaou");
		Chien mirza = new Chien("Castafiore", 3, "Mirza");
		Chien medor = new Chien("Dupont", 3, "Medor");
		
		milou.manger();
		miaou.manger();
		
		Animal[] animaux = new Animal[4];
		animaux[0] = milou;
		animaux[1] = miaou;
		animaux[2] = mirza;
		animaux[3] = medor;
		
		animaux[3].manger();
		
		for(Animal a: animaux) {
			System.out.println(a);
		}
		
		System.out.println("");
		
		Animal[] autresAnimaux = {milou, miaou, mirza, medor};
		for(int i=0; i<autresAnimaux.length; i++) {
			System.out.println(autresAnimaux[i]);
		}
		
		System.out.println("");
		
		LinkedList<Animal> listeAnimaux = new LinkedList<Animal>();
		listeAnimaux.add(milou);
		listeAnimaux.add(miaou);
		listeAnimaux.add(mirza);
		listeAnimaux.add(medor);
		
		System.out.println(listeAnimaux);
		
		System.out.println("");
		
		Zoo zoo = new Zoo();
		zoo.addAnimal(milou);
		zoo.addAnimal(miaou);
		
		System.out.println(zoo);
		
	}

}
