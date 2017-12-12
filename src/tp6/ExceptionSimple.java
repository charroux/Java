package tp6;

public class ExceptionSimple {
	
	public void fonction(int i) throws Exception{
		if(i == 0) throw new Exception();
	}
	
	public static void main(String[] a) {
		try {
			ExceptionSimple exceptionSimple = new ExceptionSimple();
			exceptionSimple.fonction(0);
			System.out.println("Affichage ?");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
