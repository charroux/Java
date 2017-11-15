package tp1;

import java.util.Scanner;

public class Eleves {

	public static void main(String[] args) {
		
		String[] chaines = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir des chaînes de caractères (terminez par entrée):");
		
		for(int i=0; i<chaines.length; i++) {
			chaines[i] = sc.nextLine();
		}
		
		System.out.println("Vous avez saisie :");
		
		for(int i=0; i<chaines.length; i++) {
			System.out.println(chaines[i]);
		}

	}

}
