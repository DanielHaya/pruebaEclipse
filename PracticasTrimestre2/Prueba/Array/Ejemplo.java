package Array;
import java.util.Scanner;
public class Ejemplo {

	public static void main(String[] args) {
		
		int [] z = new int [10];
		Scanner teclado = new Scanner (System.in);
		
		for (int i = 0;i<10;i++) {
			System.out.println("introduce la edad para el trabajador");
			z[i]=teclado.nextInt();
		}
		System.out.println(z[4]);
	}
}
