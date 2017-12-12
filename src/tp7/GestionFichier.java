package tp7;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Scanner;

public class GestionFichier {
	
	public static void main(String[] a) {

		try {
			URI uri = new URI("file:///foo/bar/bidon.txt");	// toujours / => portable entre Linux et Windows
			File file = new File(uri);
			FileInputStream fis = new FileInputStream(file);
			Scanner scanner = new Scanner(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			String path = "." + File.separator + "data" + File.separator + "bidon1.txt";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Scanner scanner = new Scanner(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
