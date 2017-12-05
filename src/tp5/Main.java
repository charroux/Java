package tp5;

public class Main {

	public static void main(String[] args) {
		PolyLigne polyLigne = new PolyLigne();
		
		Point p1 = new Point(0, 0);
		polyLigne.add(p1);
		
		Point p2 = new Point(0, 1);
		polyLigne.add(p2);
		
		System.out.println(polyLigne);
	}

}
