package tp6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		
		// Java oblige à capturer les exceptions FileNotFoundException...
		try {
			FileInputStream fichier = new FileInputStream("bidon.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Java n'oblige pas capturer les RunTimeException
		int tab[] = new int[1];		
		tab[1000] = 1;
	}

}
