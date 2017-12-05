package tp6;

public class Test {

	public static void main(String[] args) {
		try {
			Compte compte = new Compte(10);
			compte.crediter(10);
			float solde = compte.debiter(5);
			System.out.println("Le solde du compte est : " + solde);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
