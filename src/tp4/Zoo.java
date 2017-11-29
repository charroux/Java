package tp4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	// private List<Animal> animaux = new List<Animal>(); ne compile pas (on ne peut pas instancier une interface
	// private ArrayList<Animal> animaux = new ArrayList<Animal>(); // possible
	private List<Animal> listeAnimaux;

	public Zoo() {
		listeAnimaux = new ArrayList<Animal>(); 
	}
	
	public List<Animal> getListeAnimaux() {
		return listeAnimaux;
	}
	
	public void setListeAnimaux(List<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}
	
	@Override
	public String toString() {
		return "Zoo [listeAnimaux=" + listeAnimaux + ", toString()=" + super.toString() + "]";
	}

	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}
}
