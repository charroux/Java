package tp7;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.Scanner;

public class GestionFichier {
	
	public static void main(String[] a) {

		try {
			String user = System.getProperty("user.home");
			System.out.println(user);
			user = user.replace("\\", "/");
			System.out.println(user);
			String location = "file:///" + user + "/bidon.txt";
			URI uri = new URI(location);
			System.out.println(uri);
			File file = new File(uri);
			FileInputStream fis = new FileInputStream(file);
			Scanner scanner = new Scanner(fis);
			String s;
			while(scanner.hasNextLine()) {
				s = scanner.nextLine();
				System.out.println(s);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		/*try {
			URI uri = new URI("file:///c:/foo/bar/bidon.txt");	// toujours / => portable entre Linux et Windows
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
		}*/
	}

}
