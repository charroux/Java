package tp3;

import java.util.ArrayList;

public class Voiture {
	
	private String marque;
	private int nbPortes;
	private Conducteur conducteur;
	// private Passager[] passagers =  new Passager[4]; problème = taille fixe
	ArrayList<Passager> passagers = new ArrayList<Passager>(); 
	
	public Voiture(String marque, int nbPortes, Conducteur conducteur) {
		this.marque = marque;
		this.nbPortes = nbPortes;
		this.conducteur = conducteur;
	}
	
	public void addPassager(Passager passager) {
		passagers.add(passager);
	}
	
	public void removePassager(Passager passager) {
		passagers.remove(passager);
	}
	
	public ArrayList<Passager> getPassagers(){
		return passagers;
	}
	
	public void setPassagers(ArrayList<Passager> passagers){
		this.passagers = passagers;
	}
	
	

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public String toString() {
		return "Voiture [marque=" + marque + ", nbPortes=" + nbPortes + ", conducteur=" + conducteur + ", passagers=" + passagers + "]";
	}
	
}
