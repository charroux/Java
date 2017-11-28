package tp3;

public class Main {

	public static void main(String[] args) {
		
		Conducteur tintin = new Conducteur("Tintin");
		Voiture peugeot = new Voiture("Peugeot", 5, tintin);
		
		Passager haddock = new Passager("Haddock");
		peugeot.addPassager(haddock);
	
		System.out.println(peugeot);    // System.out.println(peugeot.toString());
		System.out.println(tintin);
		System.out.println(haddock);
		
		peugeot.setNbPortes(3);
		System.out.println(peugeot);
		
	}

}
