package tp2;

public class Statistique {
	
	private float[] notes;
	
	public Statistique(int nbNotes) {
		notes = new float[nbNotes];
		for(int i=0; i<notes.length; i++) {
			notes[i] = (float) (Math.random() * 20);
		}
	}

	public Statistique(float[] notes) {
		this.notes = new float[notes.length];
		for(int i=0; i<notes.length; i++) {
			this.notes[i] = notes[i];
		}
	}
	
	public float moyenne() {
		float moyenne = 0;		
		for(int i=0; i<notes.length; i++) {
			moyenne = moyenne + notes[i];
		}
		return moyenne / notes.length;
	}
	
	public float ecartType() {
		float moyenne = this.moyenne();
		float ecartType = 0;
		for(int i=0; i<notes.length; i++) {
			ecartType = ecartType + (float)Math.pow(notes[i] - moyenne, 2);
		}
		ecartType = ecartType / notes.length;
		return (float)Math.sqrt(ecartType);
	}
	
	public float ecartType(float moyenne) {
		float ecartType = 0;
		for(int i=0; i<notes.length; i++) {
			ecartType = ecartType + (float)Math.pow(notes[i] - moyenne, 2);
		}
		ecartType = ecartType / notes.length;
		return (float)Math.sqrt(ecartType);
	}
}
