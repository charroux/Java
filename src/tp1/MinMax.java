package tp1;

public class MinMax {
	
	
	
	private int i;

	public static void main(String[] args) {

		int[] tabEntiers = {1, 5, 6};
		
		int[] tabEntiers1 = new int[3];
		tabEntiers1[0] = 1;
		tabEntiers1[1] = 5;
		tabEntiers1[2] = 6;
		
		int minimum = Integer.MAX_VALUE;
		
		for(int i=0; i<tabEntiers.length; i++) {
			if(tabEntiers[i] < minimum) {
				minimum = tabEntiers[i];
			}
		}
		
		System.out.println("Le minimum est : " + minimum);
		
		// même chose en initialisant le minimum à la première case
		
		minimum = tabEntiers[0];
		
		for(int i=1; i<tabEntiers.length; i++) {
			if(tabEntiers[i] < minimum) {
				minimum = tabEntiers[i];
			}
		}
		
		System.out.println("Le minimum est : " + minimum);
		
	}

}
