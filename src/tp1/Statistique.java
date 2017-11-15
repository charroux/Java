package tp1;

public class Statistique {

	public static void main(String[] args) {

		float[] notes = new float[10];
		
		for(int i=0; i<notes.length; i++) {
			notes[i] = (float) (Math.random() * 20);
			System.out.println((notes[i]));
		}
		
		float moyenne = 0;
		
		for(int i=0; i<notes.length; i++) {
			moyenne = moyenne + notes[i];
		}
		
		moyenne = moyenne / notes.length;
		
		System.out.println("La moyenne est : " + moyenne);
		
	}

}
