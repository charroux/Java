package tp1;

import java.util.Scanner;

public class Eleves {

	public static void main(String[] args) {
		
		String[] chaines = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir des cha�nes de caract�res (terminez par entr�e):");
		
		for(int i=0; i<chaines.length; i++) {
			chaines[i] = sc.nextLine();
			if(chaines[i].equals(" ")) {
				
			}
		}
		
		System.out.println("Vous avez saisie :");
		
		for(int i=0; i<chaines.length; i++) {
			System.out.println(chaines[i]);
		}

		sc.close();
		
	}

}
