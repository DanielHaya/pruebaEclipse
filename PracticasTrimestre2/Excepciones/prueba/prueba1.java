package prueba;

public class prueba1 {

	public static void main(String[] args) {
		
		try {
			
			int [] array = new int [20];
			
			array[-3]=24;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Te has equivocado zorra");
		}
		
		
		
	}

}
