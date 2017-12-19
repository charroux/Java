package tp7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestionFichier {
	
	public void sauvegardePersonne(Personne personne, String fichierPersonne) throws IOException {
		FileWriter fileWriter = null;
		try {
			String path = "." + File.separator + "data";	
			File file = new File(path);
			file.mkdirs();
			path = "." + File.separator + "data" + File.separator + fichierPersonne;
			file = new File(path);
			fileWriter = new FileWriter(file);
			int age = personne.getAge();
			Integer a = new Integer(age);
			String nom = personne.getNom();
			String prenom = personne.getPrenom();
			fileWriter.write(nom);
			fileWriter.write("\n");
			fileWriter.write(prenom);
			fileWriter.write("\n");
			fileWriter.write(a.toString());
			fileWriter.flush();
		} finally {
			if(fileWriter != null) {
				fileWriter.close();
			}
		}
	}
	
	public Personne chargePersonne(String fichierPersonne) throws FileNotFoundException, Exception {
		Scanner scanner = null;
		try {
			String path = "." + File.separator + "data" + File.separator + fichierPersonne;
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			scanner = new Scanner(fis);
			String nom = scanner.nextLine();
			String prenom = scanner.nextLine();
			int age = scanner.nextInt();
			Personne personne = new Personne(nom, prenom, age);
			return personne;	
		}  finally {						// on passe dans la clause finally qu'il y eu un exception ou pas
			if(scanner != null) {
				scanner.close();		// on ferme le fichier qui est détenu par le système d'exploitation
			}
		}
	}
	
	public static void main(String[] a) {
		try {
			
			GestionFichier gestionFichier = new GestionFichier();
			
			Personne personne = new Personne("Capitaine", "Haddock", 55);
			
			gestionFichier.sauvegardePersonne(personne, "personne.txt");
			
			personne = gestionFichier.chargePersonne("personne.txt");
			System.out.println(personne);
			
			personne.setAge(100);
			System.out.println(personne);
			
			gestionFichier.sauvegardePersonne(personne, "personne.txt");			
			
		} catch (FileNotFoundException e) {
			System.out.println("Pas de fichier personne.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
/*		// acces fichier chemin absolu
		
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
		}*/
	}

}
