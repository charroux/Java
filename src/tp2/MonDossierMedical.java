package tp2;

public class MonDossierMedical {
	
	private int age = 20;
	
	public MonDossierMedical(int age) {
		this.age = age;
	}
	
	public void anniversaire() {
		age++;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
