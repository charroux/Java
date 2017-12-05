package tp5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PolyLigne polyLigne = new PolyLigne();
		
		/*Scanner sc = new Scanner(System.in);
		
		String s;
		int i;
		int compteurDEntiers = 1;
		
		do {
			s = sc.next();
			if(s.equals("fin") == false) {
				i = Integer.parseInt(s);
				if(compteurDEntiers == 2) {
					
				}
				compteurDEntiers++;
			}
			
		} while(s.equals("fin") == false);*/
		
		Point p1 = new Point(0, 0);
		polyLigne.add(p1);
		
		Point p2 = new Point(0, 1);
		polyLigne.add(p2);
		
		System.out.println(polyLigne);
	}

}
