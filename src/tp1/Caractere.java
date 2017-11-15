package tp1;

public class Caractere {

	public static void main(String[] args) {

		char[] caracteres = {'a', 'b', 'a'};
		
		int compteur = 0;
		
		for(int i=0; i<caracteres.length; i++) {
			if(caracteres[i] == 'a') {
				compteur++; 		//  <=> compteur = compteur + 1;
			}
		}
		
		System.out.println("Nombre de a : " + compteur);
		
		compteur = 0;
		int i=0;
		while(i<caracteres.length) {
			if(caracteres[i] == 'a') {
				compteur++; 
			}
			i++;
		}
		
		System.out.println("Nombre de a : " + compteur);
		
		compteur = 0;
		i = 0;
		do {
			if(caracteres[i] == 'a') {
				compteur++; 
			}
			i++;
		}while(i<caracteres.length);
		
		System.out.println("Nombre de a : " + compteur);
		
	}

}
