package tp7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Scanner;

public class GestionFichier {
	
	public static void main(String[] a) {

		// acces fichier chemin absolu
		
		URI uri = null;
		Scanner scanner = null;
		
		try {
			String user = System.getProperty("user.home");	// demande au système d'exploitation
			System.out.println(user);
			user = user.replace("\\", "/");					// uniquement sous Windows, sinon ne fait rien
			System.out.println(user);
			String location = "file:///" + user + "/bidon.txt";	// création URI
			uri = new URI(location);
			System.out.println(uri);
			File file = new File(uri);
			FileInputStream fis = new FileInputStream(file);
			scanner = new Scanner(fis);
			String s;
			while(scanner.hasNextLine()) {
				s = scanner.nextLine();
				System.out.println(s);
			}
		} catch(FileNotFoundException e) {
			System.out.println("Pas de fichier dans " + uri);
		} catch(Exception e){
			e.printStackTrace();
		} finally {						// on passe dans la clause finally qu'il y eu un exception ou pas
			if(scanner != null) {
				scanner.close();		// on ferme le fichier qui est détenu par le système d'exploitation
			}
		}
	
		// acces fichier chemin relatif
		String path = null;
		
		try {
			path = "." + File.separator + "data" + File.separator + "bidon1.txt";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			scanner = new Scanner(fis);
			String s;
			while(scanner.hasNextLine()) {
				s = scanner.nextLine();
				System.out.println(s);
			}
			scanner.close();
		} catch(FileNotFoundException e) {
			System.out.println("Pas de fichier dans " + path);
		} catch(Exception e) {
			e.printStackTrace();
		}  finally {						// on passe dans la clause finally qu'il y eu un exception ou pas
			if(scanner != null) {
				scanner.close();		// on ferme le fichier qui est détenu par le système d'exploitation
			}
		}
	}

}
