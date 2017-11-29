package tp4;

public class Chat extends Animal{

	private String race;
	
	public Chat(String race, float poids, String nom) {
		super(poids, nom);
		this.race = race;
	}
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Chat [race=" + race + ", toString()=" + super.toString() + "]";
	}

}
