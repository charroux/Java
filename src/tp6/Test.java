package tp6;

public class Test {

	public static void main(String[] args) {
		try {
			Compte compte = new Compte(10, TypeCompte.EPARGNE);
			compte.crediter(10);
			float solde = compte.debiter(5);
			System.out.println("Le solde du compte est : " + solde);
			
			Banque banque = new Banque();
			banque.creerCompte("Picsou", 1000, TypeCompte.ACTIONS);
			Compte compte1 = banque.getCompte("Picsou");
			System.out.println(compte1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
